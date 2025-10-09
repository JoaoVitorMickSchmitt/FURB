package list6;

public abstract class Pessoa {

	 private String nome;
	private String cpf;
	
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	


	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}




	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract String getResumo(); 
	
}
