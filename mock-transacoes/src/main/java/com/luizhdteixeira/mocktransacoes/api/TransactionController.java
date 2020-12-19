package com.luizhdteixeira.mocktransacoes.api;

import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

public interface TransactionController {

    @GetMapping(path = "/{id}/transacoes/{ano}/{mes}", consumes = "application/json", produces = "application/json")
    ResponseEntity<List<TransactionDTO>> findByParamsTransactions(
            @PathVariable(value = "id") @Min(value = 4, message = "{id.min}") @Max(value = 6, message = "{id.max}") @NotBlank(message = "{id.not.blank}") Integer id,
            @PathVariable(value = "mes") @Min(value = 1, message = "{month.min}") @Max(value = 2, message = "{month.max}") @NotBlank(message = "{month.not.blank}") Integer month,
            @PathVariable(value = "ano") @Min(value = 2, message = "{year.min}") @Max(value = 4, message = "{year.max}") @NotBlank(message = "{year.not.blank}") Integer year
    );
}
