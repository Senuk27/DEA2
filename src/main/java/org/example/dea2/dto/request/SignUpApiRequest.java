package org.example.dea2.dto.request;

import lombok.Data;

@Data
public class SignUpApiRequest {
    private String email;
    private String password;
    private String Name;
}
