package com.luizhdteixeira.mocktransacoes.component;

import com.luizhdteixeira.mocktransacoes.dto.PersonalDataDto;
import com.luizhdteixeira.mocktransacoes.dto.TransactionDTO;
import com.luizhdteixeira.mocktransacoes.resolver.PhraseResolver;
import com.luizhdteixeira.mocktransacoes.resolver.TimestampResolver;
import com.luizhdteixeira.mocktransacoes.resolver.TransactionAmountResolver;
import com.luizhdteixeira.mocktransacoes.resolver.ValueResolver;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListTransactionComponent {

    private final PhraseResolver phraseResolver;
    private final TimestampResolver timestampResolver;
    private final TransactionAmountResolver transactionAmountResolver;
    private final ValueResolver valueResolver;

    public ListTransactionComponent(PhraseResolver phraseResolver, TimestampResolver timestampResolver, TransactionAmountResolver transactionAmountResolver, ValueResolver valueResolver) {
        this.phraseResolver = phraseResolver;
        this.timestampResolver = timestampResolver;
        this.transactionAmountResolver = transactionAmountResolver;
        this.valueResolver = valueResolver;
    }

    public List<TransactionDTO> listTransaction(PersonalDataDto dto){
        // 1. Instâncias da Lista e Quantidade de transações a ser gerada
        List<TransactionDTO> listTransaction = new ArrayList<>();
        int transactionAmount = transactionAmountResolver.transactionAmount(dto.getId(), dto.getMonth());
        // 2. Gerar transações
        for (int i = 0; i < transactionAmount; i++) {
            listTransaction.add(
                    buildTransactionDTO(
                            phraseResolver.randomPhrase(),
                            timestampResolver.randomTimestamp(dto.getMonth(), dto.getYear()),
                            valueResolver.valueTransaction(dto.getId(), i, dto.getMonth())
                    ));
        }
        return listTransaction;
    }

    private TransactionDTO buildTransactionDTO(String description, Long timestamp, BigInteger value) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setDescription(description);
        transactionDTO.setTimestamp(timestamp);
        transactionDTO.setValue(value);
        return transactionDTO;
    }




}
