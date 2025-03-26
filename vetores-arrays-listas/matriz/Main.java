package matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor M e N para a matriz: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite o valor da posição " + i + ", " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um valor X: ");
        int x = sc.nextInt();
        sc.close();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] == x){
                    System.out.println("Posição de " + x + ": " + i + ", " + j + ".");
                    if(j > 0){
                        System.out.println("Número a esquerda: " + matriz[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Número acima: " + matriz[i-1][j]);
                    }
                    if(j < n-1){
                        System.out.println("Número a direita: " + matriz[i][j+1]);
                    }
                    if(i < m-1){
                        System.out.println("Número abaixo: " + matriz[i+1][j]);
                    }
                }
            }
        }
    }
}
