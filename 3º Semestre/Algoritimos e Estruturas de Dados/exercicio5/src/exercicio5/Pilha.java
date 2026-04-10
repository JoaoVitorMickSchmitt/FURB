package exercicio5;


 public interface Pilha <T>{
	 
 public void push(T info);
 public T pop();
 public boolean estaVazia();
 public void liberar();
 public T peek();
}
