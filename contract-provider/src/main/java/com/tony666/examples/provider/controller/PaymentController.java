package com.tony666.examples.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @PostMapping("codes")
    public Object codePay() {
        return null;
    }

}
