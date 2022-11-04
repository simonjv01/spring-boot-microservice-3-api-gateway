package com.sha.springbootmicroservice3apigateway.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProviderImpl implements JwtProvider
{
    @Value("${app.jwt.secret")
    private String JWT_SECRET;

    @Value("${app.jwt.expiration-in-ms}")
    private String JWT_EXPIRATION_IN_MS;
}
