package construtech;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empreendimento extends Obra {
    private String tipoArea;
    private double metragem;
    private String localizacao;

    public Empreendimento(LocalDate dataInclusao, String descricao, ArrayList<Profissional> responsaveis,
                          String tipoArea, double metragem, String localizacao) {
        super(dataInclusao, descricao, responsaveis);
        this.tipoArea = tipoArea;
        this.metragem = metragem;
        this.localizacao = localizacao;
    }

    public String getTipoArea() {
		return tipoArea;
	}

	public void setTipoArea(String tipoArea) {
		this.tipoArea = tipoArea;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getResumo() {
        return "Empreendimento ID " + getId() + ": " + getDescricao() +
               " | Área: " + tipoArea + " | " + metragem + "m² em " + localizacao;
    }

    public String getResumoReduzido() {
        return "Empreendimento " + getId() + ": " + localizacao;
    }
}
