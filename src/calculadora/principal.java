package calculadora;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		try (Scanner a = new Scanner(System.in)) {
			int opcao;
			do {
				System.out.println("O que deseja realizar?");
				System.out.println("1- Somar");
				System.out.println("2- Subtrair");
				System.out.println("3- Multiplicar");
				System.out.println("4- Dividir");
				System.out.println("5- Sair");
				System.out.print("Opção Selecionada: ");
				opcao = a.nextInt();
				if (opcao > 0 && opcao < 5) {
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
					}
					System.out.println("Pressione enter para continuar...");
					new java.util.Scanner(System.in).nextLine();
				} else {
					System.out.println("_____FIM_____");
				}

			} while (opcao < 5);
		}
	}
}
