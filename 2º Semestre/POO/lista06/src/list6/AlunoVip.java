package list6;

public class AlunoVip extends Aluno {

	private double descontoMensalidade;

	

	public AlunoVip(String nome, String matricula, double descontoMensalidade) {
		super(nome, matricula);
		this.descontoMensalidade = descontoMensalidade;
	}


	public double getDescontoMensalidade() {
		return descontoMensalidade;
	}


	public void setDescontoMensalidade(double descontoMensalidade) {
		this.descontoMensalidade = descontoMensalidade;
	}

	
	@Override
	public String getResumo() {
		return "Acesso a treinos personalizados e sala exclusiva " + super.getResumo();
	}
	
	
}
