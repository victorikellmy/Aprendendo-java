package Ex2;

public class Amigo {
    public String nome;
    public int idade;
    private String CPF;
    private String telefone;

    public Amigo(String nome, int idade, String cPF, String telefone) {
        this.nome = nome;
        this.idade = idade;
        CPF = cPF;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Amigo \n idade=" + idade + "\n nome=" + nome;
    }

}
