package dev.lxqtpr.linda.productservice.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ValidationErrorResponse {
    private final Integer statusCode;

    private final List<Violation> violations;

}