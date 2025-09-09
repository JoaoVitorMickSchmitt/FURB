package entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um plano de treino de um aluno.
 */
public class PlanoTreino {

	private String descricao;
	private int nivel;
	private boolean ativo;

	private Aluno aluno; // pertence a 1 aluno
	private List<Exercicio> exercicios; // composição: plano é dono dos exercícios

	public PlanoTreino(String descricao, int nivel, boolean ativo, Aluno aluno) {
		if (descricao == null || descricao.isBlank()) {
			throw new IllegalArgumentException("Descrição não pode estar vazia.");
		}
		this.descricao = descricao;
		this.nivel = nivel;
		this.ativo = ativo;
		this.aluno = aluno;
		this.exercicios = new ArrayList<>();
	}

	// Métodos para gerenciar exercícios
	public void adicionarExercicio(Exercicio e) {
		exercicios.add(e);
	}

	public void removerExercicio(Exercicio e) {
		exercicios.remove(e);
	}

	// Getters e Setters normais
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}
}
