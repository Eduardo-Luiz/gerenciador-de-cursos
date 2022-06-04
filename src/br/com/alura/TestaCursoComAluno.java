package br.com.alura;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso curso = new Curso("Coleções Java", "Paulo Silveira");
        curso.add(new Aula("Trabalhando com List", 25));
        curso.add(new Aula("Mais práticas com relacionamentos", 30));

        Aluno aluno1 = new Aluno("Henrique Seiva", 14567);
        Aluno aluno2 = new Aluno("Isabela Seiva", 34909);
        Aluno aluno3 = new Aluno("Aline Seiva", 74567);

        curso.matricula(aluno1);
        curso.matricula(aluno2);
        curso.matricula(aluno3);

        curso.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O aluno " + aluno1.getNome() + " está matriculado?");
        System.out.println(curso.estaMatriculado(aluno1));

        Aluno alunoProcurado = new Aluno("Henrique Seiva", 14567);
        System.out.println("E o aluno " + alunoProcurado.getNome() + ", está matriculado?");
        System.out.println(curso.estaMatriculado(alunoProcurado));




    }
}
