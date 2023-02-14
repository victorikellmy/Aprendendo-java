package Ex3;

import javax.swing.JOptionPane;

public class Executor {
    public static void main(String[] args) {

        Medicamento[] medicamento = new Medicamento[4];
        for (int i = 0; i < medicamento.length; i++) {
            medicamento[i] = new Medicamento();
            medicamento[i].setAno_atual(Integer.parseInt(JOptionPane.showInputDialog("Insirao o ano atual")));
            medicamento[i].setAno_fanricacao(
                    Integer.parseInt(JOptionPane.showInputDialog("Insira o fno de frabricação do medicamneto ")));
            medicamento[i].setTempo_vencimento(
                    Integer.parseInt(JOptionPane.showInputDialog("Insira o ano da validade do medicamneto ")));

            if (medicamento[i].getAno_atual() - medicamento[i].getAno_fanricacao() >= medicamento[i]
                    .getTempo_vencimento()) {

                JOptionPane.showMessageDialog(null, "o medicamento esta vencido");
            }

            else {
                JOptionPane.showMessageDialog(null, "O medicamento nao esta vencico");

            }
        }

    }

}
