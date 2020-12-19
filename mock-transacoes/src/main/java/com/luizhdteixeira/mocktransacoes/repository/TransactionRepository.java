package com.luizhdteixeira.mocktransacoes.repository;

import com.luizhdteixeira.mocktransacoes.dto.PersonalDataDto;
import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;

import java.util.List;

public interface TransactionRepository {

    List<TransactionDTO> findAllTransactions(PersonalDataDto dto);
}
