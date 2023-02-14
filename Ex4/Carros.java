package Ex4;

public class Carros {
    public String placa;
    public int ano;
    public String localidade;
    public String cor;
    public String marca;
    public String modelo;

    public Carros(String placa, int ano, String localidade, String cor, String marca, String modelo) {
        this.placa = placa;
        this.ano = ano;
        this.localidade = localidade;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

}
