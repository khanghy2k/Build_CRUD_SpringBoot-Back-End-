package com.ra.shop.shopcoreservice.presentation.service;

import com.ra.shop.shopcoreservice.persistence.entity.CategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<CategoryEntity> findAll();
    List<CategoryEntity> findByName(String name);
    CategoryEntity findById(String id);
    CategoryEntity save(CategoryEntity categoryEntity);
    CategoryEntity remove(String id);
}
