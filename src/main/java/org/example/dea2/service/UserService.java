package org.example.dea2.service;

import org.example.dea2.dto.request.LoginApiRequest;
import org.example.dea2.dto.request.SignUpApiRequest;
import org.example.dea2.dto.response.ApiResponse;

public interface UserService {
    ApiResponse userSignUp(SignUpApiRequest request);

    ApiResponse userLogin(LoginApiRequest request);
}
