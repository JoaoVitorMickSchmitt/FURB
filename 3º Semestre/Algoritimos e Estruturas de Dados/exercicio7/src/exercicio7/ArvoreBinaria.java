package exercicio7;

public class ArvoreBinaria<T> {

	private NoArvoreBinaria<T> raiz;

	public ArvoreBinaria() {
		super();
		this.raiz = null;
	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

	public boolean estaVazia() {
		return raiz == null;
	}

	public boolean pertence(T info) {

		if (this.raiz == info) {
			return true;
		}
		return pertenceRec(this.raiz, info);

	}

	private boolean pertenceRec(NoArvoreBinaria<T> no, T info) {

		if (no == null) {
			return false;
		}
		if (no.getInfo() == info) {
			return true;
		}
		if (pertenceRec(no.getEsquerda(), info)) {
			return true;
		}
		if (pertenceRec(no.getDireita(), info)) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
	    return arvorePre(this.raiz);
	}

	private String arvorePre(NoArvoreBinaria<T> no) {
	    if (no == null) {
	        return "<>";
	    }

	    return "<" + no.getInfo()
	            + arvorePre(no.getEsquerda())
	            + arvorePre(no.getDireita())
	            + ">";
	}

	public int contarNos() {
		return contarNos(this.raiz);
	}

	private int contarNos(NoArvoreBinaria<T> no) {
		if (no == null) {
			return 0;
		}

		return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
	}

}
