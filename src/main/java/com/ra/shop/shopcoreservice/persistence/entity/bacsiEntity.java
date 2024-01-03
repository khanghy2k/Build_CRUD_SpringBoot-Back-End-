package com.ra.shop.shopcoreservice.persistence.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mysql.cj.protocol.ColumnDefinition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bacsi")
public class bacsiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="MaBacSi")
    private int MaBacSi;
    @Column(name = "TenBacSi")
    private String TenBacSi;
    @Column(name ="ChuyenKhoa")
    private String ChuyenKhoa;
    @Column(name="GioiTinh")
    private String GioiTinh;
    @Column(name ="TrinhDo")
    private String TrinhDo;
    @Column(name="SoDienThoai")
    private String SoDienThoai;
    @Column(name="Email")
    private String Email;
    @Column(name="DiaChi")
    private String DiaChi;
    @Column(name="NgaySinh")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date NgaySinh;
    @Column(name="GhiChu")
    private String GhiChu;
    @Column(name="TrangThaiHoatDong")
    private boolean TrangThaiHoatDong;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB",name="photos")
    private String photos;

}
