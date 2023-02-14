package Ex5;

public class Homens {
    String nome;
    String esporte;
    int idade;
    String trabalhoManual;

    public Homens(String nome, String esporte, int idade, String trabalhoManual) {
        this.nome = nome;
        this.esporte = esporte;
        this.idade = idade;
        this.trabalhoManual = trabalhoManual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTrabalhoManual() {
        return trabalhoManual;
    }

    public void setTrabalhoManual(String trabalhoManual) {
        this.trabalhoManual = trabalhoManual;
    }

}
