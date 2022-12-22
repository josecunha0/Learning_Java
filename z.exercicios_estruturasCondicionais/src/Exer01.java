/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

import java.util.Scanner;
public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite o número a ser verificado: ");
        x = sc.nextInt();

        if (x < 0) {
            System.out.printf("%nO número (%d) é um número negativo.", x);
        } else {
            System.out.printf("%nO número (%d) é um número positivo.", x);
        }

        sc.close();
    }
}
