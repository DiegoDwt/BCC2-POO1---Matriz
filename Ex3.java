import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
       
        System.out.println("Número de alunos: ");
        int alunos = entrada.nextInt();
        
        float matriz[][] = new float[alunos][2];
        
        String nome[] =new String[alunos];  
        float media[] = new float[alunos];  
        float soma[] = new float[alunos];
        String alunoMelhorNota = "";
        float melhorNota = 0;
        String alunoPiorNota = "";
        float piorNota = 0;
       
        for (int i = 0; i < alunos; i++) {
            System.out.print("Nome aluno(a): ");
            nome[i] = entrada.next();
            for (int j = 0; j < 2; j++) {
                System.out.print((j+1) + "ª nota:");
                matriz[i][j]=entrada.nextFloat();
                soma[i] += matriz[i][j];
                if (j == 0) {
                	alunoMelhorNota = nome[i];
                	melhorNota = matriz[i][j];
                	alunoPiorNota = nome[i];
                	piorNota = matriz[i][j];
                } else {
                	if (matriz[i][j] > melhorNota) {
                		alunoMelhorNota = nome[i];
                		melhorNota = matriz[i][j];
                	}
                	if (matriz[i][j] < piorNota) {
                		alunoPiorNota = nome[i];
                		piorNota = matriz[i][j];
                	}
                }            
            }       
        }     
        
        for (int x = 0; x < alunos; x++) {
        	media[x] = (soma[x]/2);
        }
       
        for (int i = 0; i < alunos; i++) {
            System.out.println("");
            System.out.println("Aluno: " + nome[i]);
            for (int j = 0; j < 2; j++) {
            	if (j == 0) {
            		System.out.print("Notas: ");
            	}
                System.out.print(matriz[i][j]);
                if (j == 0) {
                	System.out.print(" e ");
                }
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        for (int a = 0; a < alunos; a++) {
        	System.out.println("Nome: " + nome[a] + " - Média: " + media[a]);
        }
        
        System.out.println();
        System.out.println("Pior nota: " + alunoPiorNota + " - Nota: " + piorNota);
        System.out.println("Melhor nota: " + alunoMelhorNota + " - Nota: " + melhorNota);
        
              
        
        entrada.close();
    }    
}