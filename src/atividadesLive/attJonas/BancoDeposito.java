package atividadesLive.attJonas;

import java.util.Scanner;

public class BancoDeposito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual valor deseja depositar?");
        int valor = input.nextInt();

        if (valor < 0 || valor % 2 != 0) {
            System.out.println("Não pode ser este valor");
            return;
        }
        int contadorNotas100 = 0;
        int contadorNotas50 = 0;
        int contadorNotas20 = 0;
        int contadorNotas10 = 0;
        int contadorNotas5 = 0;
        int contadorNotas2 = 0;
        int contadorNotas1 = 0;

        int notaAtual = 100;

        while (valor > 0) {
            if (valor >= notaAtual) {
                valor -= notaAtual;

                if (notaAtual == 100){
                    contadorNotas100++;
                }
                else if (notaAtual == 50){
                    contadorNotas50++;
                }
                else if (notaAtual == 20){
                    contadorNotas20++;
                }
                else if (notaAtual == 10){
                    contadorNotas10++;
                }
                else if (notaAtual == 5){
                    contadorNotas5++;
                }
                else if (notaAtual == 2){
                    contadorNotas2++;
                }
                else if (notaAtual == 1){
                    contadorNotas1++;
                }
            } else {

                if (notaAtual == 100){
                    notaAtual = 50;
                } else if (notaAtual == 50){
                    notaAtual = 20;
                }
                else if (notaAtual == 20){
                    notaAtual = 10;
                }
                else if (notaAtual == 10){
                    notaAtual = 5;
                }
                else if (notaAtual == 5){
                    notaAtual = 2;
                }
                else if (notaAtual == 2){
                    notaAtual = 1;
                }
            }
        }

        System.out.println("Notas de 100: " + contadorNotas100);
        System.out.println("Notas de 50: " + contadorNotas50);
        System.out.println("Notas de 20: " + contadorNotas20);
        System.out.println("Notas de 10: " + contadorNotas10);
        System.out.println("Notas de 5: " + contadorNotas5);
        System.out.println("Notas de 2: " + contadorNotas2);
        System.out.println("Notas de 1: " + contadorNotas1);
    }
}

