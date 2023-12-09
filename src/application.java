import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo a E-Books");
		System.out.print("Digite seu nome: ");
		String name = sc.nextLine();
		System.out.println("Ola, " + name );
		
		
		System.out.print("Digite seu endereço: " );
		String address = sc.nextLine();
		 
		System.out.print("Digite sua idade: ");
		String age =  sc.nextLine();
		
		
		System.out.print("Digite seu gênero (F/M): " );
		String gender = sc.nextLine();

		   boolean saia = false;

	        do {
	            System.out.println("1 - Criar pedido");
	            System.out.println("2 - Editar dados");
	            System.out.println("3 - Sair");

	            System.out.print("Escolha uma opção: ");
	            String option = sc.nextLine();

	            switch (option) {
	                case "1":     
	                    System.out.println("Você escolheu criar um pedido :) ");
	                    
	                    break;
	                case "2":
	                    System.out.println("Você escolheu editar dados ");
	                    break;
	                case "3":
	                    saia = true;
	                    System.out.println("S");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (!saia);
		   

		
		
		sc.close();
	}

}
