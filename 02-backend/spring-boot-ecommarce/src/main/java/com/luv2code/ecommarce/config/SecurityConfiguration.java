package com.luv2code.ecommarce.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //protect ednpoint /api/order
        http.authorizeRequests()
                .antMatchers("/api/orders/**")
                .authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt();


        // add CORS filters
        http.cors();

        // force a non-empty body for 401's to make the response more friendly
        Okta.configureResourceServer401ResponseBody(http);

        //disable  CSRF since we are not using Cookies for session tracking
        http.csrf().disable();
    }
}
