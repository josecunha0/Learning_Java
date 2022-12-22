/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

import java.util.Scanner;
public class Exer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco, total;

        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Digite quantos produto quer: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = 4.00;
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 2) {
            preco = 4.50;
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 3) {
            preco = 5.00;
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 4) {
            preco = 2.00;
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 5) {
            preco = 1.50;
            total = preco * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }

        sc.close();
    }
}