package com.ra.shop.shopcoreservice.presentation.service.Impl;

import com.ra.shop.shopcoreservice.persistence.entity.benhnhanEntity;
import com.ra.shop.shopcoreservice.persistence.repository.benhnhanRepository;
import com.ra.shop.shopcoreservice.presentation.service.benhnhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class benhnhanServiceImpl implements benhnhanService {
    @Autowired
    private benhnhanRepository benhnhanRepository;

    @Override
    public List<benhnhanEntity> getAll() {
        return benhnhanRepository.findAll();
    }

    @Override
    public benhnhanEntity save(benhnhanEntity benhnhanEntity) {
        return benhnhanRepository.save(benhnhanEntity);
    }


    @Override
    public benhnhanEntity delete(@PathVariable Integer id) {
        try {
            benhnhanEntity benhnhanEntity = findById(id);
            benhnhanRepository.delete(benhnhanEntity);
            return benhnhanEntity;
        } catch (Exception e) {
            throw new RuntimeException("Không tìm thấy bệnh nhân");
        }
    }

    @Override
    public benhnhanEntity findById(@PathVariable Integer id) {
        return benhnhanRepository.findById(id).orElse(null);
    }


}
