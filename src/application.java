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

		do {
			System.out.print("1 - Criar pedido");
			System.out.print("2 - Editar dados");
			System.out.print("3 - Sair");
			
			System.out.print("Escolha uma opção: ");
			String option = sc.nextLine();
		}
		while(! saia;) 
		
		
		sc.close();
	}

}
