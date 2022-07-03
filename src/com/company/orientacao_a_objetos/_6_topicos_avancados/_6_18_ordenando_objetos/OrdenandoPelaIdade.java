package com.company.orientacao_a_objetos._6_topicos_avancados._6_18_ordenando_objetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 22);
        Pessoa p2 = new Pessoa("Adriana", 23);
        Pessoa p3 = new Pessoa("Bruno", 21);

        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
        IdadeComparator idadeComparator = new IdadeComparator();

        Collections.sort(pessoas, idadeComparator);

        for (Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
}