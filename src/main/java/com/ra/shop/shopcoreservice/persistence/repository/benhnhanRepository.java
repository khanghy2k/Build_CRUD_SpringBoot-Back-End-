package com.ra.shop.shopcoreservice.persistence.repository;

import com.ra.shop.shopcoreservice.persistence.entity.benhnhanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface benhnhanRepository extends JpaRepository<benhnhanEntity,Integer> {

}
