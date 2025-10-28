package prova;

public class TransporteOnibus extends ServicoTransporte {

	public TransporteOnibus(String nomeServiço, String descricaoTipoTransporte) {
		super(nomeServiço, descricaoTipoTransporte);
		
	}

	@Override
	public double calcularTarifa(double distancia) {
		
		return distancia * 1.20;
	}
	

	@Override
	public double calcularTempoEstimado(double distancia) {
			return distancia * 2;
	}
	
	
	
	
	
	
	

	
	
	

}
