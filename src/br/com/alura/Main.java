package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        System.out.println(aulas.size());

        aulas.forEach(aula -> {
            System.out.println("percorrendo:");
            System.out.println("Aula " + aula);
        });

        aulas.add("Aumentando o nosso conhecimento");

        Collections.sort(aulas);

        System.out.println("Imprimindo depois de ordenado");
        System.out.println(aulas);
    }
}
