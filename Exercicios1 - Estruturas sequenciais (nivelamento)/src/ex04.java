/*Fazer um programa que leia o número de um funcionário, seu número de 
horas trabalhadas, o valor que recebe por hora e calcula o salário desse 
funcionário. A seguir, mostre o número e o salário do funcionário, com 
duas casas decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		Double h, v, salary;
		
		n = sc.nextInt();
		h = sc.nextDouble();
		v = sc.nextDouble();
		
		salary = h * v;
		
		System.out.printf("%nID number: %d%nSalary: U$ %.2f", n, salary);
		
		sc.close();
	}

}
