package com.luizhdteixeira.mocktransacoes.service;

import com.luizhdteixeira.mocktransacoes.dto.PersonalDataDto;
import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;

import javax.validation.Valid;
import java.util.List;

public interface TransactionService {

    List<TransactionDTO> generateTransactions(@Valid PersonalDataDto dto);
}
