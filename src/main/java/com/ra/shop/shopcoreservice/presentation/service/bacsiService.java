package com.ra.shop.shopcoreservice.presentation.service;


import com.ra.shop.shopcoreservice.persistence.entity.bacsiEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;

@Service
public interface bacsiService {
    List<bacsiEntity> getAll();
    void save(MultipartFile file,bacsiEntity bacsiEntity) throws IOException;
    bacsiEntity delete(Integer id);
    bacsiEntity findById(Integer id);

}
