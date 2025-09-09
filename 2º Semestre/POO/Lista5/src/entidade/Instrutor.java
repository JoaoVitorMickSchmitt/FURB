package entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um instrutor da academia.
 * 
 * Contém dados básicos, lista de alunos e possibilidade de ter um mentor.
 */
public class Instrutor {

	private String nome;
	private String cref;
	private String especialidade;
	private List<Aluno> alunos;
	private Instrutor mentor; // Associação reflexiva

	/**
	 * Construtor do instrutor.
	 *
	 * @param nome          nome completo
	 * @param cref          número do CREF
	 * @param especialidade área de atuação
	 */
	public Instrutor(String nome, String cref, String especialidade) {
		this.nome = nome;
		this.cref = cref;
		this.especialidade = especialidade;
		this.alunos = new ArrayList<>();
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Instrutor getMentor() {
		return mentor;
	}

	public void setMentor(Instrutor mentor) {
		this.mentor = mentor;
	}

	// Métodos para gerenciar alunos
	public void adicionarAluno(Aluno aluno) {
		if (!alunos.contains(aluno)) {
			alunos.add(aluno);
			aluno.setInstrutor(this);
		}
	}

	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
		aluno.setInstrutor(null);
	}

	/**
	 * Retorna resumo do instrutor.
	 */
	public String getResumo() {
		return "Instrutor: " + nome + " | CREF: " + cref + " | Especialidade: " + especialidade
				+ (mentor != null ? " | Mentor: " + mentor.getNome() : "");
	}
}
