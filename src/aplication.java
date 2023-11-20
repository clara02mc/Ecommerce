import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Bem vind a E-Books");
		System.out.print("Digite seu nome: ");
		String name = sc.nextLine();
		System.out.println("Ola, " + name );
		
		System.out.print("Digite seu endereço: " );
		int adress = sc.nextInt();
		System.out.print("Digite sua idade: ");
		String age = sc.nextLine();
		System.out.print("Digite seu gênero (F/M): ");
		String gender = sc.nextLine();
		
		
		
		
		sc.close();
	}

}
