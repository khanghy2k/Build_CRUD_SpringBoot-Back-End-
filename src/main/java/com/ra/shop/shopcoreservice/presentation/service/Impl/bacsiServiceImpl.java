package com.ra.shop.shopcoreservice.presentation.service.Impl;


import com.ra.shop.shopcoreservice.persistence.entity.bacsiEntity;
import com.ra.shop.shopcoreservice.persistence.repository.bacsiRepository;
import com.ra.shop.shopcoreservice.presentation.service.bacsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
public class bacsiServiceImpl implements bacsiService {
    @Autowired
    private bacsiRepository bacsiRepository;
    @Override
    public List<bacsiEntity> getAll() {
        return bacsiRepository.findAll();
    }

    @Override
    public void save(MultipartFile file, bacsiEntity bacsiEntity) throws IOException {
           String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            if (fileName.contains("..")) {
                throw new RuntimeException("Không tìm thấy file");
            }
           try{
               bacsiEntity.setPhotos(Base64.getEncoder().encodeToString(file.getBytes()));
           } catch (IOException e) {
               e.printStackTrace();
              }
            bacsiRepository.save(bacsiEntity);
    }


    @Override
    public bacsiEntity delete(@PathVariable Integer id) {
        try {
            bacsiEntity bacsiEntity = findById(id);
            bacsiRepository.delete(bacsiEntity);
            return bacsiEntity;
        } catch (Exception e) {
            throw new RuntimeException("Không tìm thấy bác sĩ");
        }
    }

    @Override
    public bacsiEntity findById(@PathVariable Integer id) {
        return bacsiRepository.findById(id).orElse(null);
    }


}
