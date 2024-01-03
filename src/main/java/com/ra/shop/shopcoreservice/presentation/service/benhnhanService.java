package com.ra.shop.shopcoreservice.presentation.service;

import com.ra.shop.shopcoreservice.persistence.entity.benhnhanEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface benhnhanService {
    List<benhnhanEntity> getAll();
    benhnhanEntity save(benhnhanEntity benhnhanEntity);
    benhnhanEntity delete(Integer id);
    benhnhanEntity findById(Integer id);


}
