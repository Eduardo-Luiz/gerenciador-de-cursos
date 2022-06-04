package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteImprimindoAlunosSemAcento {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        System.out.println("2) imprima o tamanho da colecao: " + alunos.size());

        alunos.add("Paulo");

        System.out.println("4) imprima o tamanho da colecao: " + alunos.size());
    }
}
