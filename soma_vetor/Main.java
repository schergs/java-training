package soma_vetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double soma = 0, media = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número real: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
            media += vetor[i];
        }
        System.out.print("Elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.print("\nSoma dos elementos: " + soma);
        System.out.print("\nMédia dos elementos: " + media / n);
        sc.close();
    }
}
