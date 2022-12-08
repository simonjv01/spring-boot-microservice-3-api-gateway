package com.sha.springbootmicroservice3apigateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import com.sha.springbootmicroservice3apigateway.model.User;
import org.springframework.security.core.Authentication;


@Service
public class AuthenticationServiceImpl implements AuthenticationService

{

    @Autowired
    private AuthenticationManager authenticationManager;

    public User signInAndReturnJWT(User signInRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword())
        );
    }
}
