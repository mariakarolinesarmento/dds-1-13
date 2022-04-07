package com.company.variaveis_e_constantes_3;

/*
Volte no exercício 03 desse capítulo e transforme o valor 70 em uma constante.
*/

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        Double notaDoAluno = scanner.nextDouble();

        Boolean passouDeAno = notaDoAluno >= 70;


        if (passouDeAno) {
            System.out.println("Parabéns! Você passou de ano.");
        } else {
            System.out.println("Infelizmente, ficou de recuperação.");
        }

        scanner.close();
    }
}
