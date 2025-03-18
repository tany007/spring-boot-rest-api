package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
public class CloudVendorException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatusCode httpStatusCode;

}
