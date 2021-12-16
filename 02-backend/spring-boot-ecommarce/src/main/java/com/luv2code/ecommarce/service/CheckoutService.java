package com.luv2code.ecommarce.service;

import com.luv2code.ecommarce.dto.PaymentInfo;
import com.luv2code.ecommarce.dto.Purchase;
import com.luv2code.ecommarce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
