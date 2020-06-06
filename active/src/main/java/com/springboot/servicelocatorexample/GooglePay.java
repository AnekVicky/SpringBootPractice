package com.springboot.servicelocatorexample;
/*
created by ANEK SINGH on 5/12/2020
*/

import org.springframework.stereotype.Service;

@Service("GooglePay")
public class GooglePay implements PaymentService {


    public void pay(PaymentRequest paymentRequest){

  System.out.println(paymentRequest.getPaymentMethod()+" : "+paymentRequest.getPaymentAmount()+" has been done!!!");
    }

}
