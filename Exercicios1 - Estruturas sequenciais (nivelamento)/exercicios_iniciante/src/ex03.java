/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: 
DIFERENCA = (A * B - C * D).*/

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	
		int A, B, C, D, di;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		di = ((A * B) - (C * D));
		System.out.printf("The product difference is: %d", di);

	}

}
