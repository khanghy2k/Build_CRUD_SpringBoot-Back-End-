package com.ra.shop.shopcoreservice.presentation.api;


import com.ra.shop.shopcoreservice.persistence.entity.bacsiEntity;
import com.ra.shop.shopcoreservice.presentation.service.bacsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/bacsi")
@CrossOrigin
public class bacsiApi {
    @Autowired
    private bacsiService bacsiService;

    @GetMapping
    public List<bacsiEntity> getAll() {
        return bacsiService.getAll();
    }

    @GetMapping("/{id}")
    public bacsiEntity findById(@PathVariable int id) {
        return bacsiService.findById(id);
    }

    @PostMapping
    public void save( @RequestParam("file") MultipartFile file,@ModelAttribute bacsiEntity bacsiEntity) throws IOException {
        bacsiService.save(file,bacsiEntity);
    }


    @PutMapping("/{id}")
    public void update(@RequestParam(  "file") MultipartFile file,@ModelAttribute bacsiEntity bacsi,@PathVariable int id) {
        try {
            bacsiService.save(file,bacsi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @DeleteMapping("/{id}")
    public bacsiEntity delete(@PathVariable Integer id){
        return bacsiService.delete(id);
    }
}
