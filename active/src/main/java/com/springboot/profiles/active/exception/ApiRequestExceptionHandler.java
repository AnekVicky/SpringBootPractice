package com.springboot.profiles.active.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiRequestExceptionHandler {

    @ExceptionHandler(ApiRequestException.class)
    @ResponseBody
    public ResponseEntity<ResponsePayload> handleException(ApiRequestException apiReqException){

        // 1 . create payload
        System.out.println("in handleException ()");
        ResponsePayload responsePayload = new ResponsePayload(
                                                              apiReqException.getMessage(),
                                                              HttpStatus.BAD_REQUEST,
                                                              ZonedDateTime.now());

        // 2.return
        return new ResponseEntity<>(responsePayload,HttpStatus.BAD_REQUEST);

    }



}

