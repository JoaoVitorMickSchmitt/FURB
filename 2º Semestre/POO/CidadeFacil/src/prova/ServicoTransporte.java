package prova;

public abstract class ServicoTransporte implements Transporte {
private String nomeServiço;
private String descricaoTipoTransporte;


	public ServicoTransporte(String nomeServiço, String descricaoTipoTransporte) {
	super();
	this.nomeServiço = nomeServiço;
	this.descricaoTipoTransporte = descricaoTipoTransporte;
	}


	public String getNomeServiço() {
		return nomeServiço;
	}


	public String getDescricaoTipoTransporte() {
		return descricaoTipoTransporte;
	}







}
