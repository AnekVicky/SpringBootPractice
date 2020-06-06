package com.springboot.servicelocatorexample;
/*
created by ANEK SINGH on 5/12/2020
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
public class PaymentController {


    @Autowired
    PaymentRegister paymentRegister;

    @GetMapping("/pay")
   public String pay(){

       PaymentRequest request = new PaymentRequest("GooglePay","100");

       PaymentService paymentService = paymentRegister.getServiceBean(request.getPaymentMethod());
       paymentService.pay(request);

       return "Success";

    }




}
