package Ex5;

public class Mulheres {
    String nome;
    int numPartos;
    int idade;
    String preventivo;

    public Mulheres(String nome, int numPartos, int idade, String preventivo) {
        this.nome = nome;
        this.numPartos = numPartos;
        this.idade = idade;
        this.preventivo = preventivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPartos() {
        return numPartos;
    }

    public void setNumPartos(int numPartos) {
        this.numPartos = numPartos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPreventivo() {
        return preventivo;
    }

    public void setPreventivo(String preventivo) {
        this.preventivo = preventivo;
    }

}
