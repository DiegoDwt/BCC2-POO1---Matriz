import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int  NUM = 5;
		
		float somaProd1 = 0;
		float somaProd2 = 0;
		float somaProd3 = 0;
		float somaProd4 = 0;
		float somaProd5 = 0;
		
		float somaMer1 = 0;
		float somaMer2 = 0;
		float somaMer3 = 0;
		float somaMer4 = 0;
		float somaMer5 = 0;
			
		float mediaProd1 = 0;
		float mediaProd2 = 0;
		float mediaProd3 = 0;
		float mediaProd4 = 0;
		float mediaProd5 = 0;

		
		String mercado[] = {"Mercado 1", "Mercado 2", "Mercado 3", "Mercado 4", "Mercado 5"};
		String produto[] = {"Sabão", "Arroz", "Feijão", "Ovos", "Leite"};
		float matriz[][] = new float[NUM][NUM];
		
		for (int x = 0; x < NUM; x++) {
			for (int y = 0; y < NUM; y++) {
				System.out.print("Preço do " + produto[y] + " no mercado " + mercado[x] + ": " );
				matriz[x][y] = entrada.nextFloat(); 
				if (y == 0) {
					somaProd1 += matriz[x][y];
				}
				if (y == 1) {
					somaProd2 += matriz[x][y];
				}
				if (y == 2) {
					somaProd3 += matriz[x][y];
				}
				if (y == 3) {
					somaProd4 += matriz[x][y];
				}
				if (y == 4) {
					somaProd5 += matriz[x][y];
				}
				if (x == 0) {
					somaMer1 += matriz[x][y];
				}
				if (x == 1) {
					somaMer2 += matriz[x][y];
				}
				if (x == 2) {
					somaMer3 += matriz[x][y];
				}
				if (x == 3) {
					somaMer4 += matriz[x][y];
				}
				if (x == 4) {
					somaMer5 += matriz[x][y];
				}
			}
			System.out.println();			
		}
		
		mediaProd1 = somaProd1 / NUM;
		mediaProd2 = somaProd2 / NUM;
		mediaProd3 = somaProd3 / NUM;
		mediaProd4 = somaProd4 / NUM;
		mediaProd5 = somaProd5 / NUM;
		
		
		System.out.println("           Sabão  |  Arroz |  Feijão  | Ovos  |  Leite | ");
	    
		for (int i = 0; i < 5; i++) {

			if (i != 0) {
				System.out.println("");
		    }
		    for (int j = 0; j < 5; j++) {

		    	if (j == 0) {
		             switch (i) {
		                 case 0:
		                	 System.out.print("MERCADO 1 ");
		                	 break;
		                 case 1:
		                	 System.out.print("MERCADO 2 ");
		                  	 break;
		                 case 2:
		                     System.out.print("MERCADO 3 ");
		                     break;
		                 case 3:
		                      System.out.print("MERCADO 4 ");
		                      break;
		                 case 4:
		                      System.out.print("MERCADO 5 ");
		                      break;

		        }
		         System.out.print(" ");
		  }

		  System.out.print("R$" + matriz[i][j] + "\t");

		         switch (i) {
		                    case 0:
		                        mercado[i] += matriz[i][j];
		                        break;
		                    case 1:
		                        mercado[i] += matriz[i][j];
		                        break;
		                    case 2:
		                       mercado[i] += matriz[i][j];
		                        break;
		                    case 3:
		                        mercado[i] += matriz[i][j];
		                        break;
		                    case 4:
		                        mercado[i] += matriz[i][j];
		                        break;
		                }

		       switch (j) {
		                    case 0:
		                        produto[j] += matriz[i][j];
		                        break;
		                    case 1:
		                        produto[j] += matriz[i][j];
		                        break;
		                    case 2:
		                        produto[j] += matriz[i][j];
		                        break;
		                    case 3:
		                        produto[j] += matriz[i][j];
		                        break;
		                    case 4:
		                        produto[j] += matriz[i][j];
		                        break;

		       }
		    }
		}
		
		 System.out.println();
		 System.out.println();

		 
		 System.out.println("Média do Sabão:  " + mediaProd1);
		 System.out.println("Média do Arroz: " +  mediaProd2);
		 System.out.println("Média do Feijão: " + mediaProd3);
		 System.out.println("Média do Ovo: " + mediaProd4);
		 System.out.println("Média do Leite: " + mediaProd5);
		 
		 System.out.println();
		 
		 System.out.println("Total no Mercado 1: " + somaMer1);
		 System.out.println("Total no Mercado 2: " + somaMer2);
		 System.out.println("Total no Mercado 3: " + somaMer3);
		 System.out.println("Total no Mercado 4: " + somaMer4);
		 System.out.println("Total no Mercado 5: " + somaMer5);

	
		entrada.close();
	}
}