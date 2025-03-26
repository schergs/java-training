package pensionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] quarto = new boolean[10];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de estudantes que vão alugar quartos: ");
        n = sc.nextInt();
        Estudante[] estudantes = new Estudante[10];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do estudante: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o email do estudante: ");
            String email = sc.nextLine();
            System.out.println("Digite o número do quarto que o estudante vai alugar (0 a 9): ");
            int numQuarto = sc.nextInt();
            if(numQuarto >= 0 && numQuarto < 10) {
                if(quarto[numQuarto]) {
                    System.out.println("Quarto já ocupado, tente novamente.");
                    i--;
                    continue;
                }
                else {
                    quarto[numQuarto] = true;
                    estudantes[numQuarto] = new Estudante(nome, email, numQuarto);
                }
            }
            else {
                System.out.println("Número de quarto inválido.");
                i--;
                continue;
            }
        }
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if(estudantes[i] != null) {
                System.out.println("Estudante: " + estudantes[i].getNome() + ", Email: " + estudantes[i].getEmail() + ", Quarto: " + estudantes[i].getNumQuarto());
            }
        }
        sc.close();
    }
}
