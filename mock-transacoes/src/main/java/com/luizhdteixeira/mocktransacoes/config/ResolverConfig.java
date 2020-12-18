package com.luizhdteixeira.mocktransacoes.config;

import com.luizhdteixeira.mocktransacoes.resolver.PhraseResolver;
import com.luizhdteixeira.mocktransacoes.resolver.TimestampResolver;
import com.luizhdteixeira.mocktransacoes.resolver.TransactionAmountResolver;
import com.luizhdteixeira.mocktransacoes.resolver.ValueResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResolverConfig {

    @Bean
    public PhraseResolver randomPhraseResolver() {
        return new PhraseResolver();
    }

    @Bean
    public TimestampResolver randomTimestampResolver() {
        return new TimestampResolver();
    }

    @Bean
    public TransactionAmountResolver transactionAmountResolver() {
        return new TransactionAmountResolver();
    }

    @Bean
    public ValueResolver valueResolver() {
        return new ValueResolver();
    }
}
