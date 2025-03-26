package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de funcionários: ");
        n = sc.nextInt();
        List<Funcionario> lista = new ArrayList<Funcionario>();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o id do funcionário: ");
            int id = sc.nextInt();
            System.out.println("Digite o nome do funcionário: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o salário do funcionário: ");
            double salario = sc.nextDouble();
            lista.add(new Funcionario(id, salario, nome));
        }

        System.out.println("Lista de funcionários: ");
        for(Funcionario func : lista) {
            System.out.println(func);
        }

        while(true) {
            System.out.println("Digite o id do funcionário que terá aumento de salário: ");
            int id = sc.nextInt();
            Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (func == null) {
                System.out.println("Este id não existe, tente novamente.");
            } else {
                System.out.println("Digite a porcentagem: ");
                double porcentagem = sc.nextDouble();
                func.aumentoSalario(porcentagem);
                break;
            }
        }

        System.out.println("Lista atualizada de funcionários: ");
        for(Funcionario func : lista) {
            System.out.println(func);
        }
    }
}
