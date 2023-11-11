package com.ra.shop.shopcoreservice.persistence.repository;

import com.ra.shop.shopcoreservice.persistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,String> {
    List<CategoryEntity> findByNameLike(String name);
}
