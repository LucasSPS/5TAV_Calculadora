package calculadora;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in)) {
			System.out.println("------CALCULADORA------");
			System.out.println("O que deseja realizar?");
			System.out.println("1- Somar");
			System.out.println("2- Subtrair");
			System.out.println("3- Multiplicar");
			System.out.println("4- Dividir");
			System.out.print("Opção Selecionada: ");
			int opcao = a.nextInt();
			System.out.print("Digite o primeiro número: ");
			int n1 = a.nextInt();
			System.out.print("Digite o segundo número: ");
			int n2 = a.nextInt();

			Calculadora calc = new Calculadora();

			switch (opcao) {
			case 1:
				System.out.println("Resultado: " + calc.somar(n1, n2));
				break;

			case 2:
				System.out.println("Resultado: " + calc.subtrair(n1, n2));
				break;

			case 3:
				System.out.println("Resultado: " + calc.multiplicar(n1, n2));
				break;

			case 4:
				System.out.println("Resultado: " + calc.dividir(n1, n2));
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
	}
}
