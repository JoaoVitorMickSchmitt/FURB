package exercicio6;

public class FilaVetor<T> implements Fila<T> {
	private T[] info;
	private int limite;
	private int tamanho;
	private int inicio;

	public FilaVetor(int limite) {

		this.info = (T[]) new Object[limite];
		this.limite = limite;
		this.tamanho = 0;
		this.inicio = 0;
	}

	@Override
	public void inserir(T valor) {

		if (tamanho == limite) {
			throw new FilaCheiaException("Fila está cheia");
		}
		int posicaoinserir;
		posicaoinserir = (inicio + tamanho) % limite;
		info[posicaoinserir] = valor;
		tamanho = tamanho + 1;

	}

	@Override
	public T retirar() {
		T valor = peek();
		inicio = (inicio + 1) % limite;
		tamanho = tamanho - 1;
		return valor;
	}

	@Override
	public boolean estaVazia() {

		if (tamanho == 0) {
			return true;
		}

		return false;

	}

	@Override
	public void liberar() {
		info = null;
		tamanho = 0;
		inicio = 0;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new FilaVaziaException("Fila esta vazia");
		}
		return info[inicio];
	}

	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {

		FilaVetor<T> f3 = new FilaVetor<>(this.tamanho + f2.tamanho);

		// insere os elementos da filha 1 que é o this(fila principal), na fila 3 que é
		// a fila final

		for (int i = 0; i < this.tamanho; i++) {
			int pos = (this.inicio + i) % this.limite;
			f3.inserir(this.info[pos]);
		}

		// agora insere os elementos da fila 2 que é a do parametro, na fila 3 que é a
		// fila final
		for (int i = 0; i < f2.tamanho; i++) {
			int pos = (f2.inicio + i) % f2.limite;
			f3.inserir(f2.info[pos]);
		}

		return f3;
	}

	public int getLimite() {
		return limite;
	}

	@Override
	public String toString() {
		if (estaVazia()) {
			return "";
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < tamanho; i++) {
			int pos = (inicio + i) % limite;
			sb.append(info[pos]);

			if (i < tamanho - 1) {
				sb.append(", ");
			}
		}

		return sb.toString();
	}

}
