package com.ra.shop.shopcoreservice.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private int UserID;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String Password;
    @Column(name = "Role")
    private String Role;
}
