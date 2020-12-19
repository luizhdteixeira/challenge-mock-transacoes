package com.luizhdteixeira.mocktransacoes.service.impl;

import com.luizhdteixeira.mocktransacoes.dto.PersonalDataDto;
import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;
import com.luizhdteixeira.mocktransacoes.repository.TransactionRepository;
import com.luizhdteixeira.mocktransacoes.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    /**
     * Método público para realizar a geração de transações mocadas baseadas em regras de negócio.
     *
     * @param dto DadosDTO é responsável por trazer de forma imutável os valores informados
     *
     * @return list Lista de Transações geradas
     *
     * */
    @Override
    public List<TransactionDTO> generateTransactions(PersonalDataDto dto) {
        return transactionRepository.findAllTransactions(dto);
    }





}
