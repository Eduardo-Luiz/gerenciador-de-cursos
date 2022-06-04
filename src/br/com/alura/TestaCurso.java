package br.com.alura;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Coleções Java", "Paulo Silveira");
        curso1.add(new Aula("Trabalhando com List", 25));
        curso1.add(new Aula("Mais práticas com relacionamentos", 30));

        System.out.println(curso1.getAulas());
    }
}
