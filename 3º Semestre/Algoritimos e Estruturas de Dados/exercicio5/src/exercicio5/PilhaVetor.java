package exercicio5;

import java.util.Arrays;

public class PilhaVetor<T> implements Pilha<T> {
 private T[] info;
private int limite;
private int tamanho;


 public PilhaVetor(int limite) {
	this.info = ((T[]) new Object [limite]);
	this.limite = limite;
	tamanho = 0;
}
 
 @Override
 public void push(T info) {
	if (limite == tamanho) {
		throw new PilhaCheiaException("Capacidade esgotada da pilha");
		}
	this.info[tamanho] = info;
	tamanho++;
	
 }

 @Override
 public T pop() {
	T valor = peek();
	tamanho = tamanho - 1;
	return valor;
 }

 @Override
public T peek() {
	if (estaVazia()) {
		throw new PilhaVaziaException("Pilha está vazia");
	}
	
	return info [tamanho-1];
}

 @Override
 public boolean estaVazia() {
     return tamanho == 0;
 }

 @Override
 public void liberar() {
 while(tamanho >0) pop();
}

 @Override
 public String toString() {
	String s = " ";
	int tamanhoString = tamanho;
	 while (tamanhoString > 0) {
		if (tamanhoString == 1) {
			s += info[tamanhoString -1];
		}else {
			s += info[tamanhoString -1] + ",";
		}
		tamanhoString--;
	}
	 return s;
 }

 
 public void concatenar(PilhaVetor<T> p) {
	    if (p.estaVazia())
	        throw new PilhaVaziaException("Pilha está vazia");

	    if (this.tamanho + p.tamanho > this.limite)
	        throw new PilhaCheiaException("Capacidade esgotada da pilha");

	    for (int i = 0; i < p.tamanho; i++) {
	        push(p.info[i]);
	    }
	}
 
 
}
