package exe05;

public class Main {
	public static void main(String[] args) {
		ListaCircular<Integer> listCirc = new ListaCircular<Integer>();
		
		listCirc.inserir(1);
		listCirc.inserir(2);
		listCirc.inserir(3);
		
		listCirc.exibir();
	}
}
