package construtech;
import java.sql.SQLOutput;
import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Empresa {
    private ArrayList<Profissional> profissionais = new ArrayList<>();
    private ArrayList<Obra> obras = new ArrayList<>();

    public void adicionarProfissional(Profissional profissional) {
       
        for (Profissional p : profissionais) {
            if (p.getCpf().equals(profissional.getCpf())) {
                System.out.println("CPF da pessoa " + p.getNome() + " já cadastrado!");
                return; 
            }
        }

        profissionais.add(profissional);
        System.out.println("Profissional " + profissional.getNome() + " adicionado com sucesso!");
    }


        public void removerProfissional(Profissional profissional) {
            profissionais.remove(profissional);
        }

        
        public void adicionarObra(Obra o) {
            obras.add(o);
            System.out.println("Obra ID " + o.getId() + " cadastrada.");
        }

        public void relatorioCompleto() {
            System.out.println("=== RELATÓRIO COMPLETO ===");
            for (Obra o : obras) {
                System.out.println(o.getResumo());
            }
        }

        public void relatorioPorTipo(String tipo) {
            System.out.println("=== RELATÓRIO POR TIPO: " + tipo + " ===");
            for (Obra o : obras) {
                if (tipo.equals("Projeto") && o instanceof Projeto) {
                    System.out.println(o.getResumo());
                } else if (tipo.equals("Empreendimento") && o instanceof Empreendimento) {
                    System.out.println(o.getResumo());
                }
            }
        }

        public void relatorioResumido() {
            System.out.println("=== RELATÓRIO RESUMIDO ===");
            for (Obra o : obras) {
                System.out.println(o.getResumoReduzido());
            }
        }
        
		
		
    }

    
    //Nao esquecer de impedir de criar 2 pessoas com id unico e
    

	
