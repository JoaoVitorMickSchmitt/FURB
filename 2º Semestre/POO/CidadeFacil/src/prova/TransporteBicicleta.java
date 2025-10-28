package prova;

public class TransporteBicicleta extends ServicoTransporte {

	public TransporteBicicleta(String nomeServiço, String descricaoTipoTransporte) {
		super(nomeServiço, descricaoTipoTransporte);
	
	}

	
	@Override
	public double calcularTarifa(double distancia) {
	
		return distancia * 0.8;
	}
	
	@Override
	public double calcularTempoEstimado(double distancia) {
	
		return distancia*3;
	}
}
