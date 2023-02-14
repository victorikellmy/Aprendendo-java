package Ex1;

import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args) {
        // esta passando argumentos pro metodo construtor
        Cliente cliente1 = new Cliente("pedro", "rua 5 lot 4", "6969");
        Cliente cliente2 = new Cliente("pedro", "rua 6 lot 4", "6966");

        // rece argumentos
        cliente1.setNome("joao");
        cliente1.setEndereco("rua 7 lot 5");
        cliente1.setTelefone("11696");

        // executa o metodo imprimir
        JOptionPane.showMessageDialog(null, cliente1.imprimir());// JOptionPane.showMessageDialog
        // (responsavel por mostrar um card na tela)

        JOptionPane.showMessageDialog(null, cliente2.imprimir());
        // System.out.println(cliente1.imprimir());
    }
}
