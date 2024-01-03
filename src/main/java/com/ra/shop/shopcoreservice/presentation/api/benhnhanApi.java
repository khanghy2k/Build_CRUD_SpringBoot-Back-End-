package com.ra.shop.shopcoreservice.presentation.api;

import com.ra.shop.shopcoreservice.persistence.entity.benhnhanEntity;
import com.ra.shop.shopcoreservice.presentation.service.benhnhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/benhnhan")
@CrossOrigin
public class benhnhanApi {
    @Autowired
    private benhnhanService benhnhanService;

    @GetMapping
    public List<benhnhanEntity> getAll(){
        return benhnhanService.getAll();
    }
    @GetMapping("/{id}")
    public benhnhanEntity findById(@PathVariable Integer id){
        return benhnhanService.findById(id);

    }
    @PostMapping
    public benhnhanEntity save(@RequestBody benhnhanEntity benhnhan){
        return benhnhanService.save(benhnhan);
    }
    @PutMapping("/{id}")
    public benhnhanEntity update(@PathVariable int id,@RequestBody benhnhanEntity benhnhanEntity){
        return benhnhanService.save(benhnhanEntity);
    }
    @DeleteMapping("/{id}")
    public benhnhanEntity delete(@PathVariable Integer id){
        return benhnhanService.delete(id);
    }


}
