package atividade190226;

public class listaEstatica {

	private int[] info;
	private int tamanho;
	
	public listaEstatica(int info, int tamanho) {
	super();
		this.info = new int[info];
		this.tamanho = tamanho;
	}

	public int[] getInfo() {
		return info;
	}

	public void setInfo(int[] info) {
		this.info = info;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
	private void redimensionar() {
	
	int [] info2 = new int[info.length + 10];
	for (int i = 0; i < info.length; i++) {
		info2[i] = info[i];
	}

	info = info2;
}
	
 public void inserir(int a) {
	
	if (tamanho == info.length) {
		redimensionar();
	}
	 info[tamanho] = a;
	tamanho++;
	

}
 public void exibir() {
	for (int i = 0; i < info.length; i++) {
		System.out.println(info[i]);
	}
}
 public int buscar(int valorBuscar) {	 
	 int indice = 0;
	 for (int i = 0; i < info.length; i++) {
		if (valorBuscar == info[i]) {
			 indice = i;
			 break;
		}else {
			 indice = -1;
		}
}
	 return indice;
 }
 public void retirar(int c) {
	
}
	
 public boolean estaVazia() {
	int estaVazio = 0;
	for (int i = 0; i < info.length; i++) {
		if (info[i] > 0) {
			estaVazio++;
		}
	}
	if (estaVazio > 0) {
		return false;
	}else {
		return true;
	}
	
}
 
 
}
	
	

