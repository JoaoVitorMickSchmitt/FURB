package prova;

public class TransporteTaxi extends ServicoTransporte{

	public TransporteTaxi(String nomeServiço, String descricaoTipoTransporte) {
		super(nomeServiço, descricaoTipoTransporte);
		// TODO Auto-generated constructor stub
	}

@Override
public double calcularTarifa(double distancia) {
	// TODO Auto-generated method stub
	return distancia * 3.5;
}
	
@Override
public double calcularTempoEstimado(double distancia) {
	return distancia * 1.5;
}

}
