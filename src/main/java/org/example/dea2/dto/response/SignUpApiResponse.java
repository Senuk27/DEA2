package org.example.dea2.dto.response;

import lombok.Data;
import org.example.dea2.entity.UserDetailsEntity;

@Data
public class SignUpApiResponse {
    private int status;
    private String message;
    private UserDetailsEntity userData;

}
