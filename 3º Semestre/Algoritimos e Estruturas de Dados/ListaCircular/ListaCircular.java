package exe05;

public class ListaCircular<T> {
	private NoListaCircular<T> primeiro;

	public ListaCircular() {
		super();
		this.primeiro = new NoListaCircular<>();
	}
	
	public void inserir(T valor) {

		NoListaCircular<T> novo = new NoListaCircular<>();
	    novo.setInfo(valor);

	    if (estaVazia()) {
	        primeiro = novo;
	        novo.setProximo(novo);
	    } else {

	    	NoListaCircular<T> p = primeiro;

	        while (p.getProximo() != primeiro) {
	            p = p.getProximo();
	        }

	        novo.setProximo(primeiro);
	        p.setProximo(novo);
	        primeiro = novo;
	    }
	}

	public void exibir() {

	    if (estaVazia()) return;

	    NoListaCircular<T> p = primeiro;

	    do {
	        System.out.println(p.getInfo());
	        p = p.getProximo();
	    } while (p != primeiro);
	}

	public boolean estaVazia() {
		if (primeiro.getInfo() == null) {
			return true;
		} else {
			return false;
		}
	}
	
}
