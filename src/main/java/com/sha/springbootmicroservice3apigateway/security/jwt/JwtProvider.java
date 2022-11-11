package com.sha.springbootmicroservice3apigateway.security.jwt;

import com.sha.springbootmicroservice3apigateway.security.UserPrincipal;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);
}
