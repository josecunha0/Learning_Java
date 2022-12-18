import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela 
a soma desses números com uma mensagem explicativa, conforme exemplos.*/

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		sum = (x+y);
		
		System.out.printf("%s + %s = %s%n", x, y, sum);
		
		sc.close();
	}

}
