package com.luizhdteixeira.mocktransacoes.exception;

import com.luizhdteixeira.mocktransacoes.exception.error.ErrorObjectNotValid;
import com.luizhdteixeira.mocktransacoes.exception.error.ErrorResponseInternal;
import com.luizhdteixeira.mocktransacoes.exception.error.ErrorResponseNotValid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<ErrorObjectNotValid> errors = getErrors(ex);
        ErrorResponseNotValid errorResponseNotValid = getErrorResponse(ex, status, errors);
        return new ResponseEntity<>(errorResponseNotValid, status);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ErrorResponseInternal internal = getErrorResponse(ex, status, body);
        return new ResponseEntity<>(internal, status);
    }

    private List<ErrorObjectNotValid> getErrors(MethodArgumentNotValidException ex) {
        return ex.getBindingResult().getFieldErrors().stream()
                .map(error -> new ErrorObjectNotValid(error.getDefaultMessage(),
                                                      error.getField(), error.getRejectedValue()))
                .collect(Collectors.toList());
    }

    private ErrorResponseNotValid getErrorResponse(MethodArgumentNotValidException ex, HttpStatus status, List<ErrorObjectNotValid> errors) {
        return new ErrorResponseNotValid("Requisition has invalid fields", status.value(), status.getReasonPhrase(),
                                         ex.getBindingResult().getObjectName(), errors);
    }

    private ErrorResponseInternal getErrorResponse(Exception ex, HttpStatus status, Object errors) {
        return new ErrorResponseInternal(errors, ex.getMessage(), status.getReasonPhrase());
    }
}
