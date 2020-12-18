package com.luizhdteixeira.mocktransacoes.exception.error;

import java.util.List;

public class ErrorResponseNotValid {

    private final String message;
    private final Integer code;
    private final String status;
    private final String objectName;
    private final List<ErrorObjectNotValid> errorList;

    public ErrorResponseNotValid(String message, Integer code, String status, String objectName, List<ErrorObjectNotValid> errorList) {
        this.message = message;
        this.code = code;
        this.status = status;
        this.objectName = objectName;
        this.errorList = errorList;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getObjectName() {
        return objectName;
    }

    public List<ErrorObjectNotValid> getErrorList() {
        return errorList;
    }
}
