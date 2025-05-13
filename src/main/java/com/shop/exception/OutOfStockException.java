package com.shop.exception;

public class OutOfStockException extends RuntimeException{
    // OutOfStockException 생성자
    public OutOfStockException(String message) {
        super(message);
    }
}


