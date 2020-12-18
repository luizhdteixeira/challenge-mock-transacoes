package com.luizhdteixeira.mocktransacoes.resolver;

import org.springframework.beans.factory.annotation.Value;

import java.util.Random;


public class PhraseResolver {

    @Value("${phrase.random}")
    private String[] words;
    @Value("${phrase.min.length}")
    private int minLengthPhrase;
    @Value("${phrase.max.length}")
    private int maxLengthPhrase;

    public String randomPhrase() {
        // 1.Gera valor aleatório e seleciona frase
        String phrase = words[new Random().nextInt(words.length)];
        // 2.Realiza um nova chamada do método se valor frase tiver menos de 10 caracteres.
        callAgainRandomPhrase(phrase);
        // 3.Retorna uma frase com no máximo 60 caracteres
        return maxLengthPhrase(phrase);
    }

    private void callAgainRandomPhrase(String phrase) {
        if (phrase.length() < minLengthPhrase)
            randomPhrase();
    }

    private String maxLengthPhrase(String phrase) {
        return phrase.length() >= maxLengthPhrase ? phrase.substring(0,60) : phrase;
    }
}
