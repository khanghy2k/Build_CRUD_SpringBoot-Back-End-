package com.ra.shop.shopcoreservice.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="benhnhan")
public class benhnhanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaBenhNhan")
    private int MaBenhNhan;
    @Column(name = "HoVaTen")
    private String HoVaTen;
    @Column(name = "Tuoi")
    private int Tuoi;
    @Column(name = "GioiTinh")
    private String GioiTinh;
    @Column(name = "DiaChi")
    private String DiaChi;
    @Column(name = "SoDienThoai")
    private String SoDienThoai;
    @Column(name = "TinhTrangSucKhoe")
    private String TinhTrangSucKhoe;
}
