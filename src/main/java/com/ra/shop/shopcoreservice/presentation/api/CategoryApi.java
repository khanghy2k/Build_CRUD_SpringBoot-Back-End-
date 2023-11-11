package com.ra.shop.shopcoreservice.presentation.api;

import com.ra.shop.shopcoreservice.persistence.entity.CategoryEntity;
import com.ra.shop.shopcoreservice.presentation.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryApi {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryEntity> get(){
        return categoryService.findAll();
    }
    @GetMapping("/{id}")
    public CategoryEntity get(@PathVariable String id){
        return categoryService.findById(id);
    }
    @PostMapping
    public CategoryEntity post(@RequestBody CategoryEntity categoryEntity){
        return categoryService.save(categoryEntity);
    }
    @PutMapping("/{id}")
    public CategoryEntity put(@PathVariable String id, @RequestBody CategoryEntity categoryEntity){
        return categoryService.save(categoryEntity);
    }
    @DeleteMapping("/{id}")
    public CategoryEntity delete(@PathVariable String id){
        return categoryService.remove(id);
    }


}
