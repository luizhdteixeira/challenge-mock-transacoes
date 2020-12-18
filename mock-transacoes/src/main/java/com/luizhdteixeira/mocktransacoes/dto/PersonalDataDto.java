package com.luizhdteixeira.mocktransacoes.dto;

public class PersonalDataDto {

    private Integer id;
    private Integer month;
    private Integer year;

    public PersonalDataDto(Integer id, Integer month, Integer year) {
        this.id = id;
        this.month = month;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

}
