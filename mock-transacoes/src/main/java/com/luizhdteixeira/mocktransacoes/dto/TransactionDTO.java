package com.luizhdteixeira.mocktransacoes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;

public class TransactionDTO {

    @JsonProperty(value = "descricao")
    private String description;
    @JsonProperty(value = "data")
    private Long timestamp;
    @JsonProperty(value = "valor")
    private BigInteger value;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }
}
