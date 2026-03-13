package exercicio4;

import exercicio3.NoLista;

public class ListaDupla <T> {

	private NoListaDupla<T> primeiro;

	public ListaDupla() {
		super();
		this.primeiro = new NoListaDupla<>();
		
	}

	public NoListaDupla<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoListaDupla<T> primeiro) {
		this.primeiro = primeiro;
	}
	
	
	public void inserir(T valor) {
		NoListaDupla<T> novo = new NoListaDupla();
		
		novo.setInfo(valor);
		novo.setProximo(primeiro);
		novo.setAnterior(null);
		if (primeiro!= null) {
			primeiro.setAnterior(novo);
		}
			primeiro = novo;
	}
	
	public NoListaDupla<T> buscar(T valor) {
		NoListaDupla<T> p = primeiro;

		while (p != null) {
			if (p.getInfo() == valor) {
				return p;
			}

			p = p.getProximo();
		}

		return null;
	}
	
	
	public void retirar(T valor) {
		NoListaDupla<T> p = buscar(valor);
		
		
		if (p != null) { // achou
			if (primeiro == p) {// primeiro elemento?
				primeiro = p.getProximo();
			}else {
				p.getAnterior().setProximo(p.getProximo());
			}
		}
		if (p.getProximo() != null) {// não é o ultimo?
			p.getProximo().setAnterior(p.getAnterior());
		}
	}
	
	
	public void exibir() {
		NoListaDupla<T> p = primeiro;

		while (p != null) {
			if (p.getInfo() != null)
				System.out.println(p.getInfo());

			p = p.getProximo();
		}
	}

	
}
