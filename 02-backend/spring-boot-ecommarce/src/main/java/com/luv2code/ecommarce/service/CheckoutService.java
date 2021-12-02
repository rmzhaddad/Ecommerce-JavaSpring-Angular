package com.luv2code.ecommarce.service;

import com.luv2code.ecommarce.dto.Purchase;
import com.luv2code.ecommarce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
