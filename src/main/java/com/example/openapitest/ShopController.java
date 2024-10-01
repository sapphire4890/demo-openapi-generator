package com.example.openapitest;

import org.openapitools.client.api.ShopApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.openapitools.client.model.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
public class ShopController extends ShopApi {
    @GetMapping("/test")
    public ResponseEntity<Order> showOrder() {
        Order order = new Order();
        order.setCustomerId("12345");
        order.setOrderId(UUID.randomUUID());
        System.out.println("Hello World");
        return ResponseEntity.ok(order);
    }
}
