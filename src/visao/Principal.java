package visao;

import java.util.Scanner;

import modelo.*;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner teclado2 = new Scanner(System.in);
		
		Empresa empresa = new Empresa();
		Departamento departamento = new Departamento();
		Funcionario funcionario = new Funcionario();
		
		int opcao2;
		
		do {
		    System.out.println("--------------------------------");
		    System.out.println("1 - Empresa");
		    System.out.println("2 - Departamento");
		    System.out.println("3 - Funcionario");
		    System.out.println("4 - Encerrar");
		    System.out.println("--------------------------------");
		    System.out.println("Escolha uma das op��es acima: ");
		    System.out.println("--------------------------------");
		
		    opcao2 = teclado2.nextInt();
		    
		    switch(opcao2) {
		    
		    case 1:
		    	empresa.MenuEmpresa();
		    	
		    	break;
		    case 2:
		    	departamento.MenuDepartamento();
		    	
		    	break;
		    case 3:
		    	funcionario.MenuFuncionario();
		    	
		    	break;
		    
		    }
		    
		    
			
		}while(opcao2!= 4);
		

	}

}
