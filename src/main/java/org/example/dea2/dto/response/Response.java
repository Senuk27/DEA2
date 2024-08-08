package org.example.dea2.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Response {
    private int status;
    private String message;

    @JsonIgnore
    private String statusCode;
    @JsonIgnore
    private String statusDesc;
}
