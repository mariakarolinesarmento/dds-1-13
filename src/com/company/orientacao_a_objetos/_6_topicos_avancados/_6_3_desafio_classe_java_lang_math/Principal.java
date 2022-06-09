package com.company.orientacao_a_objetos._6_topicos_avancados._6_3_desafio_classe_java_lang_math;

import java.util.Scanner;

/*

A Mega-Sena é o jogo que paga milhões de reais para o acertador dos números sorteados.

Em um jogo comum, os jogadores devem marcar 6 números entre os 60 disponíveis, sendo de 1 a 60.

Na empresa que você trabalha, o pessoal se juntou para fazer um bolão. Um bolão acontece quando várias pessoas se unem para jogarem várias combinações de números em conjunto. Se algum jogo for contemplado, o valor do prêmio é dividido entre todos os participantes.

Como um bom programador, você sugeriu e se dispôs a desenvolver um pequeno software para gerar os números a serem marcados nos jogos. Todos concordaram, agora você tem um importante trabalho pela frente.

Faça um programa em Java que recebe como parâmetro do usuário a quantidade de jogos a serem feitos, gera e exibe na tela a sequência de números de cada jogo.

Use a classe Math para gerar números aleatórios e fazer arredondamentos. Lembre-se de verificar se não existem números repetidos em uma sequência, pois os 6 números devem ser únicos.

Se levar esse desafio a sério, jogar na Mega-Sena e ganhar, não esqueça de nós! ;)

 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos jogos?");
        int quantidadeJogos = entrada.nextInt();

        System.out.println("-------------------------");

        for (int i = 1; i <= quantidadeJogos; i++){
            MegaSena mega = new MegaSena();
            mega.sortear();
            mega.exibirNumeros();
            System.out.println("---------------------");
        }

        System.out.println("*** Boa sorte! ***");
    }
}
