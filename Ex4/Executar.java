package Ex4;

import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args) {
        Carros[] carros = new Carros[1];
        for (int i = 0; i < carros.length; i++) {
            carros[i].placa = JOptionPane.showInputDialog("Placa: ");
            carros[i].ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
            carros[i].localidade = JOptionPane.showInputDialog("localidade: ");
            carros[i].cor = JOptionPane.showInputDialog("Cor: ");
            carros[i].marca = JOptionPane.showInputDialog("marca: ");
            carros[i].modelo = JOptionPane.showInputDialog("modelo: ");

            carros[i] = new Carros();
        }

        String texto = "Veículos:\n";
        for (int i = 0; i < carros.length; i++) {
            texto += carros[i].getMarca() + " - " + carros[i].getModelo() + " - " + carros[i].getCor() + " - "
                    + carros[i].getAno() + " - "
                    + carros[i].getPlaca() + " - " + carros[i].getLocalidade() + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}
