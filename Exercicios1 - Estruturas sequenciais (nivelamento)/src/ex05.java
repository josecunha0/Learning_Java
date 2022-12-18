/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Scanner;
import java.util.Locale;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c1, c2, n1, n2;
		double v1, v2, t1, t2, finalPrice;
		
		c1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		t1 = n1 * v1;
		t2 = n2 * v2;
		
		finalPrice = t1 + t2;
		
		System.out.printf("%nAmount: U$ %.2f", finalPrice);
		
		sc.close();
	}

}
