package lab2;


import java.util.ArrayList;

import java.util.Scanner;



public class Logs {
	
	public static ArrayList<Clients> listaClientes;
	
	Scanner input = new Scanner(System.in);
	
	
	public Logs() {
		listaClientes = new ArrayList<Clients>();
	}

	
	
	public void getLogs() {
		
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i));
			
		
			
		}///end of for 
		
		}//end of getLogs
	
	public void addClient() {
		
		String name;
		//int matricula
		//int Siape;;
		
		System.out.print("Digite o nome do cliente: ");
		name = input.nextLine();
		
		listaClientes.add(new Clients(name));
		
		
	
		
		
	}
	
	public void getClient() {
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i).getName());
			
		}
		
	
		
	}
	public void getAmountVenda() {
		int amount;
		System.out.println(" insira quantas vendas o cliente quer :");
		amount = input.nextInt();
		
		Clients cliente = listaClientes.get((listaClientes.size()-1));
		
		cliente.setAmount(amount);
		
		
		
		
	}
	public void getTypeClient() {
		int answer;
		Clients cliente =  listaClientes.get((listaClientes.size()-1));
		
		System.out.println(" tipo de cliente: aluno - 1, professor - 2 :");
		answer =input.nextInt();
		
		if(answer==1) {
			System.out.print(" Digite a matricula");
			answer = input.nextInt();
			cliente.setMatricula(answer);
			
		}
		else {
			System.out.print(" Digite a Siape");
			answer = input.nextInt();
			cliente.setSiape(answer); 
			
			
			
		}
			
		
		
		
		
	}
	
	
	
}
