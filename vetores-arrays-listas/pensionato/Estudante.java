package pensionato;

public class Estudante {
    private String nome, email;
    private int numQuarto;

    public Estudante(String nome, String email, int numQuarto) {
        this.nome = nome;
        this.email = email;
        this.numQuarto = numQuarto;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getNumQuarto() {
        return numQuarto;
    }
}
