package Ex2;

import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args) {
        boolean num = true;
        while (num) {
            Amigo amigo1 = new Amigo(null, 0, null, null);
            amigo1.setNome(JOptionPane.showInputDialog("Nome:"));
            amigo1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
            amigo1.setCPF(JOptionPane.showInputDialog("CPF:"));
            amigo1.setTelefone(JOptionPane.showInputDialog("Telefone:"));

            if (amigo1.idade < 18 || 60 < amigo1.idade) {
                JOptionPane.showMessageDialog(null, "idade errda vc so pode ser amigo de pessoas entre 18 e 60 anos");
            }

            else {
                JOptionPane.showMessageDialog(null, amigo1);
                num = false;
            }
        }
    }
}
