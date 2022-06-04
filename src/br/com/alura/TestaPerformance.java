package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
    public static void main(String[] args) {
        Collection<Integer> numeros = new HashSet<Integer>();

        long inicio = System.currentTimeMillis();

        long inicioInsercao = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }

        long fimInsercao = System.currentTimeMillis();

        long inicioBusca = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fimBusca = System.currentTimeMillis();

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
        long tempoInsercao = fimInsercao - inicioInsercao;
        long tempoBusca = fimBusca - inicioBusca;

        System.out.println("Tempo inserção: " + tempoInsercao);
        System.out.println("Tempo busca: " + tempoBusca);
        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }
}
