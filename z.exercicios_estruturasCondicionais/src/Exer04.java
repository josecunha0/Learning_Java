/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/


import java.util.Scanner;
public class Exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        int Hi = sc.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int Hf = sc.nextInt();
        int duracao;

        if (Hi < Hf) {
            duracao = (Hf - Hi);
        } else {
            duracao = ((24 - Hi) + Hf);
        }

        System.out.printf("O jogo durou %d horas.", duracao);

        sc.close();
    }
}