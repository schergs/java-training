package alturas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantas pessoas você deseja cadastrar: ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];
        boolean bool = false;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da " + (i + 1) + " pessoa: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Digite a idade da " + (i + 1) + " pessoa: ");
            int idade = sc.nextInt();
            if (idade < 16) bool = true;
            System.out.print("Digite a altura da " + (i + 1) + " pessoa: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }
        double media = 0;
        if(bool){
            double porcentagem = 0;
            System.out.print("Pessoas com menos de 16 anos: ");
            for (int i = 0; i < n; i++) {
                media += pessoas[i].getAltura();
                if(pessoas[i].getIdade() < 16) {
                    System.out.print(pessoas[i].getNome() + "   ");
                    porcentagem++;
                }
            }
            porcentagem /= n;
            System.out.printf("\nPorcentagem de pessoas com menos de 16 anos: %.2f", porcentagem);
        }
        else{
            System.out.print("Não há pessoas com menos de 16 anos.");
            for (int i = 0; i < n; i++) {
                media += pessoas[i].getAltura();
            }
        }
        media /= n;
        System.out.printf("\nAltura média das pessoas: %.2f", media);
    }
}
