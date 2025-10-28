package prova;

public class TransporteMetro extends ServicoTransporte {

	public TransporteMetro(String nomeServiço, String descricaoTipoTransporte) {
		super(nomeServiço, descricaoTipoTransporte);

	}

	@Override
	public double calcularTarifa(double distancia) {
		
		return distancia * 2;
	}
	
@Override
public double calcularTempoEstimado(double distancia) {
	// TODO Auto-generated method stub
	return distancia;
}



}
