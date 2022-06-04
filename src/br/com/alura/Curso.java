package br.com.alura;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void add(Aula novaAula){
        this.aulas.add(novaAula);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(this.alunos);
    }

    public int getTotalDuration(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
    }


    @Override
    public String toString() {
        return "[Curso: " +
                nome + '\'' +
                ", duração total: '" + this.getTotalDuration() + '\'' +
                ", aulas=" + this.getAulas().toString() +
                '}';
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
