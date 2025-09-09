package entidade;

/**
 * Representa um exercício dentro de um plano de treino.
 */
public class Exercicio {

	private String nome;
	private int series;
	private int repeticoes;
	private double carga;

	/**
	 * Construtor do exercício.
	 *
	 * @param nome       nome do exercício
	 * @param series     número de séries
	 * @param repeticoes número de repetições
	 * @param carga      peso utilizado em kg
	 */
	public Exercicio(String nome, int series, int repeticoes, double carga) {
		this.nome = nome;
		this.series = series;
		this.repeticoes = repeticoes;
		this.carga = carga;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	/**
	 * Retorna resumo do exercício.
	 */
	public String getResumo() {
		return nome + " - " + series + "x" + repeticoes + " | " + carga + "kg";
	}
}
