package Ex6;

import javax.swing.JOptionPane;

public class Iniciador {
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[2];
        String txt = "";
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            alunos[i].nome = JOptionPane.showInputDialog("Insira o nome do " + (i + 1) + "º aluno");
            alunos[i].curso = JOptionPane.showInputDialog("Insira o curso do " + (i + 1) + "º aluno");
            alunos[i].disciplina = JOptionPane.showInputDialog("Insira a disciplina do " + (i + 1) + "º aluno");
            alunos[i].media = JOptionPane.showInputDialog("Insira a media do " + (i + 1) + "º aluno");
        }

        for (Aluno aluno : alunos) {
            txt += "Nome: " + aluno.nome + "\nCurso: " + aluno.curso + "\nDisciplina: " + aluno.disciplina + "\nMedia: "
                    + aluno.media + "\n\n";
        }
        JOptionPane.showMessageDialog(null, txt);
    }
}
