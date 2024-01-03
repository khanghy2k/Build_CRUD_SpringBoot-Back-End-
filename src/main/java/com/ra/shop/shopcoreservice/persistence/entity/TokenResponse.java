package com.ra.shop.shopcoreservice.persistence.entity;

import lombok.Data;

@Data
public class TokenResponse {
    private String token;
    private String tokenType = "Bearer";
}
