package com.ra.shop.shopcoreservice.presentation.service;

import com.ra.shop.shopcoreservice.persistence.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface User {
    UserEntity save(UserEntity userEntity);
}
