package com.ra.shop.shopcoreservice.presentation.api;

import com.ra.shop.shopcoreservice.config.JwtFilter;
import com.ra.shop.shopcoreservice.persistence.entity.TokenRequest;
import com.ra.shop.shopcoreservice.persistence.entity.TokenResponse;
import com.ra.shop.shopcoreservice.persistence.entity.UserEntity;
import com.ra.shop.shopcoreservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin
public class AuthenticationApi {
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity getToken(@RequestBody TokenRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String token = jwtUtil.generateToken(userDetails);
        TokenResponse response = new TokenResponse();
        response.setToken(token);
        return new ResponseEntity(response, HttpStatus.OK);
    }

}
