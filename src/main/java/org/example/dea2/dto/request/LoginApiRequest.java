package org.example.dea2.dto.request;

import lombok.Data;

@Data
public class LoginApiRequest {
    private String email;
    private String password;
}
