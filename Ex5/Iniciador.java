package Ex5;

import javax.swing.JOptionPane;

public class Iniciador {
    public static void main(String[] args) {
        Homens[] homens = new Homens[1];
        for (int i = 0; i < homens.length; i++) {
            homens[i].setNome(JOptionPane.showInputDialog(null, "Nome:"));
            homens[i].setEsporte(JOptionPane.showInputDialog(null, "Qual trbalho manual sabe fazer:"));
            homens[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:")));
            homens[i].setTrabalhoManual(JOptionPane.showInputDialog(null, "Qual trbalho manual sabe fazer:"));
            homens[i] = new Homens(null, null, i, null);
        }

        Mulheres[] mulheres = new Mulheres[1];
        for (int i = 0; i < mulheres.length; i++) {
            mulheres[i].setNome(JOptionPane.showInputDialog(null, "Nome:"));
            mulheres[i].setNumPartos(Integer.parseInt(JOptionPane.showInputDialog(null, "Partos:")));
            mulheres[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:")));
            mulheres[i].setPreventivo(JOptionPane.showInputDialog(null, "Preventivo"));
            mulheres[i] = new Mulheres(null, i, i, null);

        }

        String listaMu = "Mulheres\n";
        for (int i = 0; i < mulheres.length; i++) {
            listaMu += mulheres[i].getNome() + "-" + mulheres[i].getIdade();
        }
        String listaMa = "<Homens\n";
        for (int i = 0; i < mulheres.length; i++) {
            listaMa += homens[i].getNome() + "-" + homens[i].getIdade();
        }
        JOptionPane.showMessageDialog(null, listaMa);
        JOptionPane.showMessageDialog(null, listaMu);
    }
}
