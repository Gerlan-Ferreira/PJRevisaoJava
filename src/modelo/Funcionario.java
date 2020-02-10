package modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Funcionario{
	
	private int id;
	private String nome;
	private int cpf;
	private Departamento departamento;
	private Endereco endereco;
	public static ArrayList Funcionario  = new ArrayList();
	
	public Funcionario() {
		
		
	}

	public Funcionario(int id, String nome, int cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "Funcionario Id: " + id + "\n Nome: " + nome + "\n CPF: " + cpf + "\n Rua: " + endereco.getRua() + 
				"\n Bairro: " + endereco.getBairro() + "\n Cidade: " + endereco.getCidade() + "\n Departamento: " + departamento.getNome(); 
	}
	
	
	
	public void MenuFuncionario() {
		
		Scanner teclado = new Scanner(System.in);
		
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
				func.endereco.setId(cod_endereco);
				
				System.out.println("Informe o nome do funcionario: ");
				func.setNome(teclado.nextLine());
				
				System.out.println("Informe o nome da rua do funcionario: ");
				
				func.endereco.setRua(teclado.nextLine());
				
				System.out.println("Informe o nome do bairro do funcionario: ");
				func.endereco.setBairro(teclado.next());
				
				System.out.println("Informe a cidade onde reside o funcionario: ");
				func.endereco.setCidade(teclado.nextLine());
				
				System.out.println("Informe o código do departamento no qual esse funcionario faz parte: ");
				
				System.out.println("--------------------------------------------------------");
				System.out.println("Segue abaixo os departamentos cadastradas no sistema: ");
				System.out.println("--------------------------------------------------------");
				
				for (int i = 0; i < Departamento.Departamento.size(); i++) {
					
					System.out.println("------------------------------------");
					System.out.println("Departamentos: ");
					System.out.println(Departamento.Departamento.get(i).toString());
					System.out.println("------------------------------------");
				}
				int cod_dep = teclado.nextInt();
				
				for (int i = 0; i < Departamento.Departamento.size(); i++) {
					
					Departamento aux_dep = (Departamento) Departamento.Departamento.get(i);
					
					if (aux_dep.getCodigo() == cod_dep) {
						
						
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