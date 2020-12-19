package com.luizhdteixeira.mocktransacoes.exception.error;

import java.util.Date;

public class ErrorResponse {

    private final Integer status;
    private final Date timestamp;
    private final String detailMessage;
    private final String description;

    public ErrorResponse(Integer status, Date timestamp, String detailMessage, String description) {
        this.status = status;
        this.timestamp = timestamp;
        this.detailMessage = detailMessage;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public String getDescription() {
        return description;
    }
}
