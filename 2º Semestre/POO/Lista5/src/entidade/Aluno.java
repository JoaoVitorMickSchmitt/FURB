package entidade;

/**
 * Representa um aluno com informações como nome, matrícula, idade, peso e
 * altura. Agora inclui referência ao Instrutor e ao PlanoTreino (0..1).
 */
public class Aluno {

	private String nome;
	private int matricula;
	private int idade;
	private double peso;
	private double altura;
	private Instrutor instrutor; // associação com Instrutor
	private PlanoTreino planoTreino; // 0..1 plano ativo

	public Aluno(String nome, int matricula, int idade, double peso, double altura) {
		if (idade < 0) {
			throw new IllegalArgumentException("A idade está negativa");
		}
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	// Getters e setters "normais"
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public PlanoTreino getPlanoTreino() {
		return planoTreino;
	}

	public void setPlanoTreino(PlanoTreino planoTreino) {
		this.planoTreino = planoTreino;
	}

	/**
	 * Resumo simples do aluno.
	 */
	public String getResumo() {
		return "Aluno: " + nome + " (Matrícula " + matricula + ")"
				+ (instrutor != null ? " | Instrutor: " + instrutor.getNome() : "");
	}
}
