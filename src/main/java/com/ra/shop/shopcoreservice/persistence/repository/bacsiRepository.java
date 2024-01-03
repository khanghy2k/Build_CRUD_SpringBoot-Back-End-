package com.ra.shop.shopcoreservice.persistence.repository;

import com.ra.shop.shopcoreservice.persistence.entity.bacsiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface bacsiRepository extends JpaRepository<bacsiEntity,Integer> {

}
