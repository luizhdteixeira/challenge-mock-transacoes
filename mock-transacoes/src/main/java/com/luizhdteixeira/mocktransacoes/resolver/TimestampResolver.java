package com.luizhdteixeira.mocktransacoes.resolver;

import java.sql.Timestamp;

public class TimestampResolver {

    public long randomTimestamp(int month, int year) {
        long offset = Timestamp.valueOf(year + "-" + month + "-30 00:00:00").getTime();
        long end = Timestamp.valueOf(year + "-" + month + "-01 00:00:00").getTime();
        long diff = end - offset + 1;
        return new Timestamp(offset + (long) (Math.random() * diff)).getTime();
    }
}
