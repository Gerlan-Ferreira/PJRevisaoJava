package modelo;

import java.util.ArrayList;
import java.util.Scanner;


public class Departamento extends Endereco{
	
	private int codigo;
	private String nome;
	
	public static ArrayList Departamento = new ArrayList();
	
	
	public Departamento() {
		
		
	}

	public Departamento(int codigo, String nome) {
		
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nCodigo: " + codigo + "\nNome: " + nome +
				"\nRua: " + this.getRua() + 
				"\nBairro: " + this.getBairro() + 
				"\nCidade: " + this.getCidade();
	}
	
	
	
	public void MenuDepartamento() {
		
		Scanner teclado = new Scanner(System.in);
		
		//Endereco endereco_dep = new Endereco();
		
		int cod = 0;
		int cod_endereco = 0;
		int opcao;
		
		do {
			System.out.println("--------------------------------");
    		System.out.println("\t Departamento");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("4 - Voltar");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			
			case 1:
				
				if (Empresa.Empresa.isEmpty()) {
					
					System.out.println("Nenhuma empresa cadastrada, primeiro cadastre a empresa depois o departamento!");
					
				}else {
				
				Departamento dep  = new Departamento();
				
				cod++;
				cod_endereco++;
				
				dep.setCodigo(cod);
				dep.setId_end(cod_endereco);
				
				System.out.println("Informe o nome do departamento: ");
				dep.setNome(teclado.next());
				teclado.nextLine();
				
				System.out.println("Informe o nome da rua do departamento: ");
				
				dep.setRua(teclado.nextLine());
				
				System.out.println("Informe o nome do bairro do departamento: ");
				dep.setBairro(teclado.next());
				teclado.nextLine();
				
				System.out.println("Informe a cidade onde reside o departamento: ");
				dep.setCidade(teclado.nextLine());
				
				System.out.println("--------------------------------------------------------");
				System.out.println("Segue abaixo as Empresas cadastradas no sistema: ");
				System.out.println("--------------------------------------------------------");
				
				for (int i = 0; i < Empresa.Empresa.size(); i++) {
					
					System.out.println("------------------------------------");
					System.out.println("\t Empresas: ");
					System.out.println("--------------------------");
					System.out.println(Empresa.Empresa.get(i).toString());
					System.out.println("------------------------------------");
				}
				
				System.out.println("Informe o código da empresa no qual esse departamento faz parte: ");
				int cod_empresa = teclado.nextInt();
				
				
				for (int i = 0; i < Empresa.Empresa.size(); i++) {
					
					Empresa aux = (Empresa) Empresa.Empresa.get(i);
					
					if (aux.getCodigo() == cod_empresa) {
						
						
					}else {
						
						System.out.println("Codigo inválido!");
					}
				}
				
				
				Departamento.add(dep);
				
				}
				break;
				
			case 2:
				
				if (Departamento.isEmpty()) {
					
					System.out.println("Não existe departamentos cadastrados!");
					
				}
				else {
					
					for(int i = 0; i < Departamento.size(); i++) {
						
						System.out.println("--------------------------");
						System.out.println("\t Departamento: ");
						System.out.println("--------------------------");
						System.out.println(Departamento.get(i).toString());
						System.out.println("---------------------------");
						
					}
					
				}
				
				break;
				
			case 3:
				
				if (Departamento.isEmpty()) {
					
					System.out.println("Não existe departamentos cadastrados!");
					
				}
				else {
					
					
					System.out.println("--------------------------------------------------------");	
					System.out.println("Para remover algum departamento, usamos sua identificação no sistema (Codigo) para removê-lo.");
					System.out.println("--------------------------------------------------------");
					System.out.println("--------------------------------------------------------");
					System.out.println("Segue abaixo os departamentos cadastrados no sistema: ");
					System.out.println("--------------------------------------------------------");
					
					for (int i = 0; i < Departamento.size(); i++) {
						
						System.out.println("--------------------------");
						System.out.println("\t Departamentos: ");
						System.out.println("---------------------------");
						System.out.println(Departamento.get(i).toString());
						System.out.println("---------------------------");
						
					}
					System.out.println("--------------------------------------------------------");
					System.out.println("Quais dos departamentos apresentados acima você deseja remover? ");
					System.out.println("--------------------------------------------------------");
					System.out.println("Informe o Codigo do departamento que você deseja remover!");
					System.out.println("--------------------------------------------------------");
					int codDep = teclado.nextInt();
					
					for (int i = 0; i < Departamento.size(); i++) {
						
						Departamento dep_aux = (Departamento) Departamento.get(i);
						
						if (dep_aux.getCodigo() == codDep) {
							
							Departamento.remove(i);
							System.out.println("Removido com sucesso!");
						}
						
					}
					
					
				}

				break;

			}
			
		}while (opcao !=4);
		
		
		
	}
	
	
	
	
}
