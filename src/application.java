import java.util.Scanner;

public class aplication {

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
	
//		System.out.println("Menu de opções:");
//		System.out.println("1 - Criar Pedidos \n 2- Editar Dados \n 3- Voltar");
//		
//		System.out.println("Escolha uma opção:");
		
		
		
		
		sc.close();
	}

}
