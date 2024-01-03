package com.ra.shop.shopcoreservice.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="chitietdonthuoc")
public class CTdonThuocEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="MaChiTiet")
    private int MaChiTiet;
    @Column(name ="MaDonThuoc")
    private int MaDonThuoc;
    @Column(name ="MaThuoc")
    private int MaThuoc;
    @Column(name ="SoLuong")
    private int SoLuong;
    @Column(name="huongdanlieudung")
    private String huongdanlieudung;
    @Column(name="ThanhTien")
    private int ThanhTien;
}
