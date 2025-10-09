package list6;

public class InstrutorMusculacao extends Instrutor {

	
	
	public InstrutorMusculacao(String nome,String cpf, String cref, String especialidade) {
		super(nome, cpf, cref, especialidade);
		
	}

	@Override
	public String getResumo() {
		return "Instrutor especializado em hipertrofia muscular" + super.getResumo();
	}
	
}
