package com.luv2code.ecommarce.dto;

import com.luv2code.ecommarce.entity.Address;
import com.luv2code.ecommarce.entity.Customer;
import com.luv2code.ecommarce.entity.Order;
import com.luv2code.ecommarce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
