package fila;

import exception.FilaCheiaException;
import exception.FilaVaziaException;

public class FilaVetor<T> implements Fila<T> {

	private T[] info;
	private int limite;
	private int tamanho;
	private int inicio;
	
	@SuppressWarnings("unchecked")
	public FilaVetor(int limite) {
		super();
		this.info = (T[]) new Object[limite];
		this.limite = limite;
		tamanho = 0;
		inicio = 0;
	}

	public T[] getInfo() {
		return info;
	}

	public void setInfo(T[] info) {
		this.info = info;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	@Override
	public void inserir(T valor) {
		if(tamanho == limite) {
			throw new FilaCheiaException("Fila Cheia");
		}
		int posicaoInserir;
		posicaoInserir = (inicio+tamanho) % limite;
		info[posicaoInserir] = valor;
		tamanho++;
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public T peek() {
		if(estaVazia()) {
			throw new FilaVaziaException("Fila vazia");
		}
		return info[inicio];
	}

	@Override
	public T retirar() {
		T valor = peek();
		inicio = (inicio + 1) % limite;
		tamanho--;
		return valor;
	}

	@Override
	public void liberar() {
		for (int i = 0; i < limite; i++) {
			if(info[i] != null) {
				retirar();
			}
		}
	}
	
	public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
		FilaVetor<T> concatenado = new FilaVetor<T>(this.limite + f2.limite);
	    for (int i = 0; i < this.limite; i++) {
	    	if(this.info[i] != null) {
		    	concatenado.inserir(this.info[i]);

	    	}
			
		}for (int i = 0; i < f2.getLimite(); i++) {
			if(f2.info[i] != null) {
		    	concatenado.inserir(f2.info[i]);

	    	}
		}
	    return concatenado;
	    
	   
	}
	
	public int getLimite() {
		return limite;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < info.length; i++) {
			if(info[i] != null)
				s += (info[i+1] != null) ? info[i] +", " : info[i];
		}
		return s;
	}
	
	
	

}
