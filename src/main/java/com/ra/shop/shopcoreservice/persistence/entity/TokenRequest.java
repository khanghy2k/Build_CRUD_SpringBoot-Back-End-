package com.ra.shop.shopcoreservice.persistence.entity;

import lombok.Data;

@Data
public class TokenRequest {
    private String username;
    private String password;
}
