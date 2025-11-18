package estudoProva3UI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

	private int id;
	private String nome;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

		
		public static void adicionarPessoa(Usuario pessoa) {
		
			PrintWriter pw = null;
			try {
				File arquivo = new File("C:\\Windows\\Temp\\arquivo.csv");
				pw = new PrintWriter(new FileWriter(arquivo, true));
				pw.println(pessoa.toCSV());
			} catch (IOException e) {
				System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
			} finally {
				if (pw != null) {
					pw.close();
				}
			}
		}
	
		public String toCSV() {
			return id + ", " + nome; 
		}
	
	
		public static List<Usuario> lerUsuarios() {
			// Inicia um arraylist de PessoasCSV
			List<Usuario> usuarios = new ArrayList<>();
			try {
				// Inicia um scanner para fazer a leitura do arquivo.
				Scanner sc = new Scanner(new File("C:\\Windows\\Temp\\arquivo.csv"), "UTF-8");

				String linha;
			
				// Percorre todas as linhas do arquivo
				while (sc.hasNext()) {
					 Usuario u = new Usuario();
					// faz a leitura da linha
					linha = sc.nextLine();
					// Separa os dados de acordo com as ","
					String[] dados = linha.split(",");
					// converte os dados que estão em texto.
					 u.id = Integer.parseInt(dados[0]);
					 u.nome = dados[1];
					// adiciona o objeto no arraylist.
				    
					usuarios.add(u);
				}
				// Retorna o arraylist.
				return usuarios;
			} catch (IOException e) {
				System.out.println("Erro ao ler o arquivo");
			}
			return null;
		}
		
		public static void atualizarPessoa(int id, String novoNome) {

			// Faz a leitura das pessoas no arquivo.
			List<Usuario> usuarios = lerUsuarios();

			try {
				// Instância o objeto responsável por inserir dados no arquivo.
				PrintWriter pw = new PrintWriter(new FileWriter("C:\\Windows\\Temp\\arquivo.csv", StandardCharsets.UTF_8));
				// Faz a leitura das pessoas, que estão no arquivo.
				for (Usuario usuario : usuarios) {

					// Ao encontrar o registro que precisa ser atualizado.
					if (usuario.getId() == id) {
						usuario.setNome(novoNome);
						
					}
					// Printa todas as pessoas novamente no arquivo.
					pw.println(usuario.toCSV());

				}
				pw.close();
			} catch (IOException e) {
				System.out.println("Erro ao gravar o arquivo " + e.getMessage());
			}
		}
		
		
	
}
