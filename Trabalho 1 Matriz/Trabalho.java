//Trabalho com intuito academico.
//Matheus Magno Carvalho Correa.
//Engenharia de software.
//Univille.
package com.company;
import java.util.Scanner;


public class Trabalho {
    static int[][] rotacionarmatriz(int[][] matriz) {
        // Rotacionar
        int novamatriz[][] = new int[matriz.length][matriz.length];
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                novamatriz[linha][(matriz.length - 1) - coluna] = matriz[coluna][linha];
            }
        }
        return novamatriz;
    }
    // inserino os numeros da Matriz
    static int[][] numematriz(int[][] matriz) {

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Informe o valor para a posição " + (j + 1) + " do campo " + (i + 1));
                matriz[i][j] = leitor.nextInt();
            }

        return matriz;
    }


    public static void main(String[] args) {
        //começo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserira o tamnaho de  matriz quadrada");
        int dados = scanner.nextInt();


        // Matriz
        int[][] matriz = new int[dados][dados];
        int[][] novamatriz = new int[dados][dados];
        if (dados==dados) ;
        matriz = numematriz(matriz);

        System.out.println("A matriz inicial:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.print("\n");
        }

        System.out.println("Informe quantos graus deseja rotacionar sua Matriz:");
        System.out.println("90°");
        System.out.println("180°");
        System.out.println("270°");
        System.out.println("360°");
        int opcao = scanner.nextInt();

        while (opcao % 90 != 0 || opcao > 360) {
            System.out.println("Informe a opção correta!!");
            System.out.println("Informe novamente a opção correta");
            System.out.println("Informe quantos graus deseja rotacionar:");
            System.out.println("90°");
            System.out.println("180°");
            System.out.println("270°");
            System.out.println("360°");
            opcao = scanner.nextInt();
        }

        novamatriz = matriz;
        if (opcao % 90 == 0 && opcao <= 360) {
            int rotacao = opcao / 90;
            for (int numRotacao = 0; numRotacao < rotacao; numRotacao++) {
                novamatriz = rotacionarmatriz(novamatriz);
            }
        }

        System.out.println("A matriz nova:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + novamatriz[i][j] + "]");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
    }






