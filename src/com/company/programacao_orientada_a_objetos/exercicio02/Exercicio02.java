package com.company.programacao_orientada_a_objetos.exercicio02;

/*

Refatore este código alterando o método estático para um método de instância.

 */

public class Exercicio02 {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook XZ10";
        produto.quantidadeEstoque = 8;
        System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
    }

    static Boolean eNecessarioReporEstoque(com.company.programacao_orientada_a_objetos.exercicio01.Produto produto) {
        if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }
        return false;
    }
}
