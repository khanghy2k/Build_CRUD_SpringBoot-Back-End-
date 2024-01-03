package com.ra.shop.shopcoreservice.presentation.service.Impl;

import com.ra.shop.shopcoreservice.persistence.UserDetailsAdapter;
import com.ra.shop.shopcoreservice.persistence.entity.UserEntity;
import com.ra.shop.shopcoreservice.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByUsername(username).orElse(null);
        if (user != null) {
            UserDetails userDetails = new UserDetailsAdapter(user);
            return userDetails;
        }
        throw new UsernameNotFoundException("User name \"" + username + "\" not found!");
    }
}
