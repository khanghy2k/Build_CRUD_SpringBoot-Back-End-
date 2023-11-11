package com.ra.shop.shopcoreservice.exception;

import lombok.Data;

@Data
public class ErrorMessage {
    private String code;
    private String description;
    private Message message;
    private Object data;


}
