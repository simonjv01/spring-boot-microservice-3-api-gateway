package com.sha.springbootmicroservice3apigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gateway/purchase")//pre-path
public class PurchaseController {

    @Autowired
    private PurchaseServiceRequest purchaseServiceRequest;

    @PostMapping//gateway/purchase
    
}
