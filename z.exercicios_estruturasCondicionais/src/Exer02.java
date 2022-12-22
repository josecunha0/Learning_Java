/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/

import java.util.Scanner;
public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite o número a ser verificado: ");
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.printf("%nO númer (%d) é um número par.", x);
        } else {
            System.out.printf("%nO númer (%d) é um número ímpar.", x);
        }

        sc.close();
    }
}