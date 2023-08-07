import java.util.Scanner;


public class Condicional {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		int [] vetor = new int [4];
		int soma = 0;
		int media = 0;
		int quantidadeNotas = 1;

		for(int i = 0; i < vetor.length;i++) {
			System.out.println("Digite o valor da nota "+quantidadeNotas++);
			vetor[i] = input.nextInt(); 
			soma += vetor[i];
		}
		media = soma/vetor.length;
		
		for(int j = 0; j < vetor.length; j++) {
			System.out.println(" Suas notas foram "+vetor[j]);
		}
		
		System.out.println();
		
		if(media < 5) {
			
			System.out.println("Aluno Reprovado NOTA FINAL = "+(double)media);
		}
		
		else if(media > 5 && media< 7) {
			
			System.out.println("Aluno em Recuperação NOTA FINAL = "+(double)media);
		}
		
		else if(media > 7) {
			
			System.out.println("Aluno Aprovado Parabéns NOTA FINAL = "+(double)media);
		}
		
	}

}