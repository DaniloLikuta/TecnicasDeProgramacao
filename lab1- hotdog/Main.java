package lab1;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		int amount = 1;
		
		
		Scanner input = new Scanner(System.in);
		//Init the array
		
		Client[] arrayClients = new Client[30];
		
		for (int i = 0; i < arrayClients.length; i++) {
			arrayClients[i] = new Client();
			
			
			
		}
		
		
 		       //Hotdog Cart
		System.out.println("Cash desk open:");//Init cash
		
		System.out.print(" Enter the name of client: ");
		 String name = input.nextLine();
		 //Receive the input of name 
		 
		System.out.print(" Enter the id of client: ");
		 int id = input.nextInt();
		 //Receive the input of id 
		 
		
		
		Client client = new Client(name, id);
		
		//Select how many bundles of hotdog will sell
		System.out.println(" How many hotdogs u wanna bought? ");
		amount = input.nextInt();
		client.sell.setAmount(amount);
		
		
		
		
		do {
		//System.out.print(" Enter how much hotdogs client want buy: ");
			System.out.print("Select the protein of hotdog. Type 1 for sausage, 2 for linguiça, 3 for chicken and 4 for bacon: ");
		
			int choose = input.nextInt();
			client.sell.hotdog.setProtein(choose);
			
			
			System.out.print("Select chesse type. Type 1 for mussarela, 2 for prato, 3 for parmesão and 4 for coalho ");
				choose = input.nextInt();
				client.sell.hotdog.setCheese(choose);
				
			
		
				
				
				
				
				amount--;
		}while(amount > 0);
		
		
		System.out.println(client.getDataClient());
		
		System.out.println(client.sell.hotdog.getProtein());
		System.out.println(client.sell.hotdog.getCheese());
		
		
		
		

	
	
		
	input.close();
	//end of main
	}

}
