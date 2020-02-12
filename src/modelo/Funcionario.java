package modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Funcionario extends Endereco{
	
	private int id;
	private String nome;
	public static ArrayList Funcionario  = new ArrayList();
	
	public Funcionario() {
		
		
	}

	public Funcionario(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	
	}

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


	@Override
	public String toString() {
		return "\n Id: " + id + "\n Nome: " + nome + "\n Rua: " + this.getRua() + "\n Bairro: " + this.getBairro()
		+ "\n Cidade: " + this.getCidade(); 
	}
	
	
	
	public void MenuFuncionario() {
		
		Scanner teclado = new Scanner(System.in);
		//Endereco endereco_func = new Endereco();
		
		int cod = 0;
		int cod_endereco = 0;
		int opcao;
		
		do {
			
			System.out.println("--------------------------------");
    		System.out.println("\t Funcionário");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Remover");
			System.out.println("4 - Voltar");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			
			case 1:
				
				if (Departamento.Departamento.isEmpty()) {
					
					System.out.println("Nenhum departamento cadastrado, primeiro cadastre o departamento depois o funcionario!");
				}
				else {
					
				
				Funcionario func = new Funcionario();
				
				cod++;
				cod_endereco++;
				func.setId(cod);
				func.setId_end(cod_endereco);
				
				System.out.println("Informe o nome do funcionario: ");
				func.setNome(teclado.next());
				teclado.nextLine();
				
				System.out.println("Informe o nome da rua do funcionario: ");
				
				func.setRua(teclado.nextLine());
				
				System.out.println("Informe o nome do bairro do funcionario: ");
				func.setBairro(teclado.next());
				teclado.nextLine();
				
				System.out.println("Informe a cidade onde reside o funcionario: ");
				func.setCidade(teclado.nextLine());
				
				System.out.println("--------------------------------------------------------");
				System.out.println("Segue abaixo os departamentos cadastradas no sistema: ");
				System.out.println("--------------------------------------------------------");
				
				for (int i = 0; i < Departamento.Departamento.size(); i++) {
					
					System.out.println("------------------------------------");
					System.out.println("\t Departamentos: ");
					System.out.println("------------------------------------");
					System.out.println(Departamento.Departamento.get(i).toString());
					System.out.println("------------------------------------");
				}
				
				System.out.println("Informe o código do departamento no qual esse funcionario faz parte: ");
				
				int cod_func = teclado.nextInt();
				
				for (int i = 0; i < Departamento.Departamento.size(); i++) {
					
					Departamento aux_dep = (Departamento) Departamento.Departamento.get(i);
					
					if (aux_dep.getCodigo() == cod_func) {
						
						
					}else {
						
						System.out.println("Codigo inválido!");
					}
				}
				
				Funcionario.add(func);
				
				}
				
				break;
			case 2:
				
				if (Funcionario.isEmpty()) {
					
					System.out.println("Nenhum funcionário foi cadastrado!");
					
				}
				else {
					
					for(int i = 0; i < Funcionario.size(); i++) {
						
						System.out.println("--------------------------");
						System.out.println("\t Funcionarios: ");
						System.out.println("---------------------------");
						System.out.println(Funcionario.get(i).toString());
						System.out.println("---------------------------");
						
					}
				}
				
				
				break;
			case 3:
				
				if (Funcionario.isEmpty()) {
					
					System.out.println("Nenhum funcionário foi cadastrado!");
					
				}
				else {
					
					System.out.println("--------------------------------------------------------");	
					System.out.println("Para remover algum funcionario usamos sua identificação no sistema (Id) para removê-lo.");
					System.out.println("--------------------------------------------------------");
					System.out.println("--------------------------------------------------------");
					System.out.println("Segue abaixo os funcionarios cadastrados no sistema: ");
					System.out.println("--------------------------------------------------------");
					

					for (int i = 0; i < Funcionario.size(); i++) {
						
						System.out.println("--------------------------");
						System.out.println("\t Funcionarios: ");
						System.out.println("---------------------------");
						System.out.println(Funcionario.get(i).toString());
						System.out.println("---------------------------");
						
					}
					System.out.println("--------------------------------------------------------");
					System.out.println("Quais dos funcionarios apresentados acima você deseja remover? ");
					System.out.println("--------------------------------------------------------");
					System.out.println("Informe o ID do funcionario que você deseja remover!");
					int codFunc = teclado.nextInt();
					
					for (int i = 0; i < Funcionario.size(); i++) {
						
						Funcionario aux_func = (Funcionario) Funcionario.get(i);
						
						if (aux_func.getId() == codFunc) {
							
							Funcionario.remove(i);
							System.out.println("Removido com sucesso!");
							
							
						}
						
					}
					
				}
				
				
				
				break;
			
			}
			
			
		}while(opcao != 4);
		
		
	}
	

}