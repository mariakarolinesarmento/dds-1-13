package com.company.orientacao_a_objetos._6_topicos_avancados._6_4_tratando_e_lancando_excecoes;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
