package atividade190226;

public class ex1 {

	public static void main(String[] args) {
		
	listaEstatica listadados = new listaEstatica(4, 0);

	listadados.inserir(3);
	listadados.inserir(4);
	listadados.inserir(5);
	listadados.inserir(6);
	listadados.inserir(7);
	
	listadados.exibir();
	System.out.println("\n");
	System.out.println(listadados.estaVazia());
	System.out.println(listadados.buscar(4));
	
	
	
	
	}
	
	
	


}
