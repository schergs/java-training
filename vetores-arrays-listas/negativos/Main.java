package negativos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N (máximo = 10): ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número inteiro: ");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.print(vetor[i]);
            }
        }
        sc.close();
    }
}
