package lista02;

public class ListaEstatica <T>{
	private T[] info;
	private int tamanho;
	
	public ListaEstatica() {
		super();
		this.info = (T[]) new Object[10];
		this.tamanho = 0;
	}
	
	private void redimensionar() {
	    
	    T[] novo = (T[]) new Object[info.length + 10];
	    
	    for (int i = 0; i < tamanho; i++) {
	        novo[i] = info[i];
	    }
	    
	    info = novo;
	}
	
	public void inserir(T valor) {
	    if (tamanho == info.length) {
	        redimensionar();
	    }
	    
	    info[tamanho] = valor;
	    tamanho++;
	}
	
	public void exibir() {
	    for (int i = 0; i < tamanho; i++) {
	        System.out.print(info[i] + " ");
	    }
	    System.out.println();
	}
	
	public int buscar(T valor) {
	    for (int i = 0; i < tamanho; i++) {
	        if (info[i] == valor) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	public void retirar(T valor) {
		int pos = buscar(valor);
	    
	    if (pos != -1) {
	        for (int i = pos; i < tamanho; i++) {
	            info[i] = info[i + 1];
	        }
	        
	        tamanho--;
	    } else {
	        System.out.println("Valor não encontrado!");
	    }
	}
	
	public boolean estaVazia() {
		if (tamanho <= 0) {
			return true;
		}

		return false;
	}
	
	public void liberar() {
		T vetorLiberado[] = (T[]) new Object[10];
		
		info = vetorLiberado;
		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public T obterElemento(int posicao) {
		if (posicao < 0 || posicao >= tamanho) {
			throw new IndexOutOfBoundsException();
		}
		
		return info[posicao];
	}
	
	public void inverter() {
		int temp = tamanho - 1;
		for (int i = 0; i < tamanho / 2; i++) {
			T aux = info[temp];
			info[temp] = info[i];
			info[i] = aux;
			
			temp--;
		}
		exibir();
	}
	
	@Override
	public String toString() {
		String S = "[";
		
		for (int i = 0; i < tamanho; i++) {
			S += info[i];
			
			if (i < tamanho - 1) {
				S += ", ";
			}
		}
		
		S += "]\n";
		
		return S;
	}
			
}




