package com.luizhdteixeira.mocktransacoes.api.impl;

import com.luizhdteixeira.mocktransacoes.api.TransactionController;
import com.luizhdteixeira.mocktransacoes.dto.PersonalDataDto;
import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;
import com.luizhdteixeira.mocktransacoes.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TransactionControllerImpl implements TransactionController {

    private final TransactionService transactionService;

    public TransactionControllerImpl(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public ResponseEntity<List<TransactionDTO>> findByParamsTransactions(@Valid Integer id, @Valid Integer mes, @Valid Integer ano) {
        return ResponseEntity.ok(transactionService.generateTransactions(new PersonalDataDto(id, mes, ano)));
    }
}
