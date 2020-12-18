package com.luizhdteixeira.mocktransacoes.exception.error;

public class ErrorResponseInternal {

    private final Object object;
    private final String detailMessage;
    private final String status;


    public ErrorResponseInternal(Object object, String detailMessage, String status) {
        this.object = object;
        this.detailMessage = detailMessage;
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public String getStatus() {
        return status;
    }
}
