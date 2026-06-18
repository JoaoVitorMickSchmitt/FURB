package pilha;

public interface Pilha <T> {
	void push(T info);
	public T pop();
	public T peek();
	public boolean estaVazia();
	public void liberar();
}
