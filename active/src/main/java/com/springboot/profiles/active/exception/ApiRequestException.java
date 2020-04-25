package com.springboot.profiles.active.exception;

public class ApiRequestException extends RuntimeException{

    String message ;
    Throwable throwable ;

    public ApiRequestException(String message ,Throwable throwable) {
        super(message,throwable);
        this.message = message;
        this.throwable = throwable;

         }


    public ApiRequestException(String message) {
        super(message);
        this.message = message;
    }


}
