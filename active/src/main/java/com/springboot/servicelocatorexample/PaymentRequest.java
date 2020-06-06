package com.springboot.servicelocatorexample;
/*
created by ANEK SINGH on 5/12/2020
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentRequest {

    String paymentMethod;
    String paymentAmount;

}
