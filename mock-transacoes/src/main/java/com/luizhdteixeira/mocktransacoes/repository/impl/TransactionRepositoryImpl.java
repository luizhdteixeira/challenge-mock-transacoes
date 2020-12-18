package com.luizhdteixeira.mocktransacoes.repository.impl;

import com.luizhdteixeira.mocktransacoes.component.ListTransactionComponent;
import com.luizhdteixeira.mocktransacoes.dto.PersonalDataDto;
import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;
import com.luizhdteixeira.mocktransacoes.repository.TransactionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    private final ListTransactionComponent listTransactionComponent;

    public TransactionRepositoryImpl(ListTransactionComponent listTransactionComponent) {
        this.listTransactionComponent = listTransactionComponent;
    }

    @Override
    public List<TransactionDTO> findAllTransactions(PersonalDataDto dto) {
        return listTransactionComponent.listTransaction(dto);
    }
}
