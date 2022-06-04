package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Coleções Java", "Paulo Silveira");
        curso1.add(new Aula("Trabalhando com List", 25));
        curso1.add(new Aula("Mais práticas com relacionamentos", 30));

        System.out.println(curso1.getAulas());

        List<Aula> classesOriginal = curso1.getAulas();

        List<Aula> classes = new ArrayList<>(classesOriginal);

        Collections.sort(classes);

        System.out.println(classes);

        System.out.println(curso1.getTotalDuration());

        System.out.println(curso1);
    }
}
