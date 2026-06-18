package pilha;

import exception.PilhaCheiaException;
import exception.PilhaVaziaException;

public class PilhaVetor<T> implements Pilha<T> {
    private T[] info;
    private int limite;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public PilhaVetor(int limite) {
        this.info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        if (limite == tamanho) throw new RuntimeException("Full Capacity");
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
        if (estaVazia()) throw new PilhaVaziaException("Pilha está vazia");
        return info[tamanho - 1];
    }

    public int getTamanho() {
        return tamanho;
    }

    public T getElement(int i) {
        if (i < 0 || i >= tamanho) throw new IndexOutOfBoundsException();
        return info[i];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        while (tamanho > 0) pop();
    }

    @Override
    public String toString() {
        String s = " ";
        int tamanhoString = tamanho;
        while (tamanhoString > 0) {
            s += (tamanhoString == 1) ? info[tamanhoString - 1] : info[tamanhoString - 1] + ",";
            tamanhoString--;
        }
        return s;
    }

    public void concatenar(PilhaVetor<T> p) {
        if (p.estaVazia()) throw new PilhaVaziaException("Pilha está vazia");
        for (int i = 0; i < p.tamanho; i++) {
            if (this.tamanho == this.limite) throw new PilhaCheiaException("Pilha Cheia!");
            this.push(p.getElement(i));
        }
    }
}
