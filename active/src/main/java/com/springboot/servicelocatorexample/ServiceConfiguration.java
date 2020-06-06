package com.springboot.servicelocatorexample;
/*
created by ANEK SINGH on 5/12/2020
*/

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean

    public FactoryBean<?> serviceLocatorFactoryBean(){

        System.out.println("in ServiceLocatorFactoryBean , doing registration ");
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();

        bean.setServiceLocatorInterface(PaymentRegister.class);

        return bean;

    }



}
