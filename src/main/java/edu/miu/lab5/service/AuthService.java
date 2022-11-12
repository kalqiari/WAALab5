package edu.miu.lab5.service;

import edu.miu.lab5.entity.dto.request.LoginRequest;
import edu.miu.lab5.entity.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
}
