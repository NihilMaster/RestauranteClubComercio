package com.app001.order_ms.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @GetMapping("/status/HEALT_CHECK")
    public String getStatus() {
        return("Order_ms HEALT OK!");
    }
}
