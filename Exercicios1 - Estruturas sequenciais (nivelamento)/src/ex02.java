/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
o valor da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

import java.util.Scanner;
import java.util.Locale;

public class ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double area, pi, raio;
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("Area do circulo = %.4f", area);
		
		sc.close();
	}

}
