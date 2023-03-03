package Ex4;

import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args) {
        Carros[] carros = new Carros[1];
        for (int i = 0; i < carros.length; i++) {
            String placa = JOptionPane.showInputDialog("Placa: ");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
            String localidade = JOptionPane.showInputDialog("localidade: ");
            String cor = JOptionPane.showInputDialog("Cor: ");
            String marca = JOptionPane.showInputDialog("marca: ");
            String modelo = JOptionPane.showInputDialog("modelo: ");

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
