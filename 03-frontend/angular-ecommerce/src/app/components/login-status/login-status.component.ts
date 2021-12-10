import { Component, OnInit } from '@angular/core';
import { OktaAuthService } from '@okta/okta-angular';

@Component({
  selector: 'app-login-status',
  templateUrl: './login-status.component.html',
  styleUrls: ['./login-status.component.css']
})
export class LoginStatusComponent implements OnInit {

  isAuthenticated: boolean = false;
  userFullName: string;
  storage: Storage=sessionStorage;

  constructor(private oktaAuthService: OktaAuthService) { }

  ngOnInit(): void {

    // Subscribe to authentication state changes
    this.oktaAuthService.$authenticationState.subscribe(
      (result) => {
        this.isAuthenticated = result;
        this.getUserDetails();
      }
    );
    
  }

  getUserDetails() {
    if (this.isAuthenticated) {

      // Fetch the logged in user details (user's claims)
      //
      // user full name is exposed as a property name
      
      this.oktaAuthService.getUser().then(
        (res) => {
    
          this.userFullName = res.name;

          //retrieve the user's email address

          const theEmail=res.email;
          const firstName=res.given_name;
          const lastName=res.family_name;

          //store the email in browser storage
          this.storage.setItem('userEmail',JSON.stringify(theEmail));
          this.storage.setItem('firstName',JSON.stringify(firstName));
          this.storage.setItem('lastName',JSON.stringify(lastName));
        }
      );
    }
  }

  logout() {
    // Terminates the session with Okta and removes current tokens.
    this.oktaAuthService.signOut();
  }
}
