package com.luizhdteixeira.mocktransacoes.resolver;

public class TransactionAmountResolver {

    public int transactionAmount(int id, int month) {
        return calculatesTransaction(id, month);
    }

    /**
     * Método realiza a multiplicação do primeiro número do id e mês informado.
     *
     * @param id Identificador da transação
     * @param month Mês que ocorreu a transação
     *
     * @return multiply Resultado da operação matemática
     * */
    protected int calculatesTransaction(int id, int month) {
        return Math.multiplyExact(month, selectFirstNumber(id));
    }

    /**
     * Método realiza a seleção do primeiro número de uma sequencia de número inteiro.
     * Ex.: 1234, ele seleciona o número 1.
     *
     * @param id Identificador que precisa ter a extração do valor.
     *
     * @return int Resultado da captura do número.
     *
     * */
    protected int selectFirstNumber(int id) {
        return Integer.parseInt(Integer.toString(id).substring(0,1));
    }
}
