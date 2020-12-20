package com.luizhdteixeira.mocktransacoes.api;

import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public interface TransactionController {

    @GetMapping(path = "/{id}/transacoes/{ano}/{mes}", consumes = "application/json", produces = "application/json")
    ResponseEntity<List<TransactionDTO>> findByParamsTransactions(
            @PathVariable(value = "id") @Min(1000) @Max(999999) @NotNull Integer id,
            @PathVariable(value = "mes") @Min(1) @Max(12) @NotNull Integer month,
            @PathVariable(value = "ano") @Min(1900) @Max(2020) @NotNull Integer year
    );
}
