package modelo;

import java.util.Scanner;
import java.util.ArrayList;


public class Empresa extends Endereco{
	
	private int codigo;
	private String nome;
	public static ArrayList Empresa = new ArrayList();
	
	
	public Empresa() {
		
		
	}
	
	
	public Empresa(int codigo, String nome, Endereco endereco) {
		
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
		return "Codigo: " + codigo + "\nNome: " + nome + "\nRua: " 
	+ this.getRua() + "\nBairro: " + this.getBairro() + "\nCidade: " + this.getCidade();
	}


	public void MenuEmpresa() {
		
		Scanner teclado = new Scanner(System.in);
		
		int cod = 0;
		int cod_end = 0;
		int opcao;
		
		do {
			System.out.println("--------------------------------");
    		System.out.println("\t Empresa");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Voltar");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			
			case 1:
				
				Empresa emp = new Empresa();
				//Endereco end = new Endereco();
				
				cod++;
				cod_end++;
				
				emp.setCodigo(cod);
				emp.setId_end(cod_end);
				
				System.out.println("Informe o nome da sua empresa: ");
				
				emp.setNome(teclado.next());
				teclado.nextLine();
				
				System.out.println("Informe o nome da rua da empresa: ");
				
				emp.setRua(teclado.nextLine());
				
				System.out.println("Informe o nome do bairro da empresa: ");
				emp.setBairro(teclado.nextLine());
				
				System.out.println("Informe a cidade onde reside a empresa: ");
				emp.setCidade(teclado.nextLine());
			
				Empresa.add(emp);
				
				System.out.println("================================");
				
				for (int i = 0; i < Empresa.size(); i++) {
					System.out.println("================================");
					System.out.println(Empresa.get(i).toString());
					System.out.println("================================");
				}
				
				System.out.println("================================");
	
				
				break;
			}
			
		}while (opcao!= 2);
		
		
	
	}
	

}