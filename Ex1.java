import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int k = 1;
		int soma = 0;
		float media = 0;
		int maior = 0;
		int menor = 0;
		int contaPar = 0;
		int contaImpar = 0;
		int somaDiagonal = 0;
		int somaSecundaria = 0;
		
		do {
			System.out.print("Informe um número impar entre 3 e 11 (Será gerada uma matriz quadrada de ordem n): ");
			num = entrada.nextInt();
			if (num < 3 || num > 11 || num % 2 == 0) {
				System.out.println("Entrada Inválida!");
			}
		} while (num < 3 || num > 11 || num % 2 == 0 );
		
		int vet[][] = new int[num][num];
		
		for (int x = 0; x < num; x++) {
			for (int y = 0; y < num; y++) {
				System.out.print("Informe o " + k + "º número: ");
				k++;
				vet[x][y] = entrada.nextInt();
				if (vet[x][y] % 2 == 0) {
					contaPar++;
				} else {
					contaImpar++;
				}
				if (x == y) {
					somaDiagonal += vet[x][y];
				}
				if ((x + 1) + (y + 1) == (num + 1)) {
					somaSecundaria += vet[x][y];
				}
				soma += vet[x][y];   // soma = soma + vet[x]
				if (x == 0 && y == 0) {
					maior = vet[x][y];
					menor = vet[x][y];
				} else {
					if (vet[x][y] > maior) {
						maior = vet[x][y];
					}
					if (vet[x][y] < menor) {
						menor = vet[x][y];
					}
				}
			}
		}
		
		media = soma / k;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + String.format("%.2f", media));
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Pares: " + contaPar);
		System.out.println("Ímpares: " + contaImpar);
		System.out.println("Soma da Diagonal Principal: " + somaDiagonal);
		System.out.println("Soma da Diagonal Secundária: " + somaSecundaria);
		
		System.out.println("**Matriz**");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(vet[i][j] + " | ");
			}
			System.out.println();	
		}
			
		entrada.close();
	}

}

