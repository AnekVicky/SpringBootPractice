package com.springboot.servicelocatorexample;
/*
created by ANEK SINGH on 5/12/2020
*/

import org.springframework.stereotype.Service;

@Service("PhonePay")
public class PhonePay implements PaymentService {


    public void pay(PaymentRequest paymentRequest){

        System.out.println("Payment "+paymentRequest.getPaymentAmount()+" has been received ");

    }
}
