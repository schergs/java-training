package lista;

public class Funcionario {
    private int id;
    private double salario;
    private String nome;

    public Funcionario(int id, double salario, String nome) {
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void aumentoSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + salario;
    }
}
