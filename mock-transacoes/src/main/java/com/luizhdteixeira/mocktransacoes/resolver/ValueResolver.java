package com.luizhdteixeira.mocktransacoes.resolver;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigInteger;

public class ValueResolver {

    @Value("${value.param.negative.positive}")
    private int paramNegativeOrPositive;

    public BigInteger valueTransaction(int id, int i, int month) {
        return negativeOrPositive(
                new BigInteger(String.valueOf(i)).multiply(BigInteger.valueOf(month)).add(BigInteger.valueOf(id)),
                i);
    }

    private BigInteger negativeOrPositive(BigInteger value, int i) {
        return i > paramNegativeOrPositive ? value.negate() : value;
    }

}
