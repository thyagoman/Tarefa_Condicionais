import java.util.Locale;
import java.util.Scanner;


public class Condicional {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double [] vetor = new double [4];
		double soma = 0;
		double media = 0;
		int quantidadeNotas = 1;

		for(int i = 0; i < vetor.length;i++) {
			System.out.println("Digite o valor da nota "+quantidadeNotas++);
			vetor[i] = input.nextDouble(); 
			soma += vetor[i];
		}
		media = soma/vetor.length;
		
		for(int j = 0; j < vetor.length; j++) {
			System.out.println(" Suas notas foram "+vetor[j]);
		}
		
		System.out.println();
		
		if(media < 5) {
			
			System.out.printf("Aluno Reprovado NOTA FINAL =  %.2f%n",media);
		}
		
		else if(media >= 5 && media <= 7) {
			
			System.out.printf("Aluno em Recuperação NOTA FINAL =  %.2f%n",media);
		}
		
		else if(media >= 7) {
			
			System.out.printf("Aluno Aprovado Parabéns NOTA FINAL = %.2f%n",media);
		}
		input.close();
	}
	
}