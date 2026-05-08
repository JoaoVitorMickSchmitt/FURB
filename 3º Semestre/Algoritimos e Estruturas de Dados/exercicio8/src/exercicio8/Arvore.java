package exercicio8;

public class Arvore<T> {

	private NoArvore<T> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public NoArvore<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	public boolean pertence(T info) {

		if (this.raiz == null) {
			return false;
		}

		return pertenceRec(raiz, info);
	}

	private boolean pertenceRec(NoArvore<T> no, T info) {

		if (no.getInfo().equals(info)) {
			return true;
		}

		NoArvore<T> p = no.getPrimeiro();

		while (p != null) {

			if (pertenceRec(p, info)) {
				return true;
			}

			p = p.getProximo();
		}

		return false;
	}

	public int contarNos() {
		return contarNos(this.raiz);
	}

	private int contarNos(NoArvore<T> no) {

		if (no == null) {
			return 0;
		}

		return 1 + contarNos(no.getPrimeiro()) + contarNos(no.getProximo());
	}

	@Override
	public String toString() {

		if (raiz == null) {
			return "";
		}

		return obterRepresentacaoTextual(raiz);
	}

	private String obterRepresentacaoTextual(NoArvore<T> no) {

		String s = "<";
		s += no.getInfo();

		NoArvore<T> p = no.getPrimeiro();

		while (p != null) {

			s += obterRepresentacaoTextual(p);

			p = p.getProximo();
		}

		s += ">";

		return s;
	}
}