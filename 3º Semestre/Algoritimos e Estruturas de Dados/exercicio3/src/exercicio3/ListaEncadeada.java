package exercicio3;
public class ListaEncadeada<T> {
	private NoLista<T> primeiro;

	public ListaEncadeada() {
		super();
		this.primeiro = new NoLista<>();
	}

	public void inserir(T valor) {
		NoLista<T> novo = new NoLista<>();

		novo.setInfo(valor);
		novo.setProximo(primeiro);

		this.primeiro = novo;
	}

	public void exibir() {
		NoLista<T> p = primeiro;

		while (p != null) {
			if (p.getInfo() != null)
				System.out.println(p.getInfo());

			p = p.getProximo();
		}
	}

	public boolean estaVazia() {
		if (primeiro.getInfo() == null) {
			return true;
		} else {
			return false;
		}
	}

	public NoLista<T> buscar(T valor) {
		NoLista<T> p = primeiro;

		while (p != null) {
			if (p.getInfo() == valor) {
				return p;
			}

			p = p.getProximo();
		}

		return null;
	}

	@SuppressWarnings("unused")
	public void retirar(T valor) {
		NoLista<T> anterior = null;
		NoLista<T> p = primeiro;

		while (p != null && p.getInfo() != valor) {
			anterior = p;
			p = p.getProximo();
		}

		if (p != null) {
			if (p != null) {
				this.primeiro = p.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		}
	}

	public int obterComprimento() {
		NoLista<T> p = primeiro;
		int contador = 0;

		while (p != null) {
			if (p.getInfo() == null) {
				break;
			}

			p = p.getProximo();
			contador++;
		}

		return contador;
	}

	public NoLista<T> obterNo(int idx) {
		if (idx < 0 || idx > obterComprimento() - 1)
			throw new IndexOutOfBoundsException();

		NoLista<T> p = primeiro;
		NoLista<T> no = null;
		int contador = 0;

		while (p.getProximo() != null) {
			if (contador == idx) {
				no = p;
				break;
			}

			contador++;
		}

		return no;
	}

	@Override
	public String toString() {
		String s = "";
		NoLista<T> p = primeiro;

		while (p != null) {
			if (p.getInfo() != null)
				s += p.getInfo() + ", ";

			p = p.getProximo();
		}

		return s;
	}
}
