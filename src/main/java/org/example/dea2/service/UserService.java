package org.example.dea2.service;

import org.example.dea2.dto.request.LoginApiRequest;
import org.example.dea2.dto.request.SignUpApiRequest;
import org.example.dea2.dto.response.LoginApiResponse;
import org.example.dea2.dto.response.SignUpApiResponse;

public interface UserService {
    SignUpApiResponse userSignUp(SignUpApiRequest request);

    LoginApiResponse userLogin(LoginApiRequest request);
}
