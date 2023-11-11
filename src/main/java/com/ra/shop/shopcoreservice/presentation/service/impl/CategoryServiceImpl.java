package com.ra.shop.shopcoreservice.presentation.service.impl;

import com.ra.shop.shopcoreservice.exception.ErrorCode;
import com.ra.shop.shopcoreservice.exception.RaException;
import com.ra.shop.shopcoreservice.persistence.entity.CategoryEntity;
import com.ra.shop.shopcoreservice.persistence.repository.CategoryRepository;
import com.ra.shop.shopcoreservice.presentation.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<CategoryEntity> findByName(String name) {
        return categoryRepository.findByNameLike("%" + name + "%");
    }

    @Override
    public CategoryEntity findById(String id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public CategoryEntity save(CategoryEntity categoryEntity) {
        return categoryRepository.save(categoryEntity);
    }

    @Override
    public CategoryEntity remove(String id) {
        try {
            CategoryEntity categoryEntity = findById(id);
            categoryRepository.delete(categoryEntity);
            return categoryEntity;
        } catch(Exception ex){
            throw new RaException(ErrorCode.SQL_ERROR);
            }
    }
}
