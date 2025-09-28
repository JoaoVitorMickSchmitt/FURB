package list6;

public class InstrutorPilates extends Instrutor {

	public InstrutorPilates(String nome, String cref, String especialidade) {
		super(nome, cref, especialidade);

	}

	@Override
	public String getResumo() {
		
		return "Instrutor especializado em pilates" + super.getResumo();
	}
	
	
}
