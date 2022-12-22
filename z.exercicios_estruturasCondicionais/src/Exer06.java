/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.util.Scanner;
public class Exer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digite um valor inteiro qualquer: ");
        x = sc.nextInt();

        if (x >= 0 && x <= 25) {
            System.out.print("O número está no intervalo entre 0 e 25.");
        } else if (x > 25 && x <= 50) {
            System.out.print("O número está no intervalo entre 25 e 50.");
        } else if (x > 50 && x <= 75) {
            System.out.print("O número está no intervalo entre 50 e 75.");
        } else if (x > 75 && x <= 100) {
            System.out.print("O número está no intervalo entre 75 e 100.");
        } else {
            System.out.print("O número está fora de qualquer intervalo.");
        }

        sc.close();
    }
}