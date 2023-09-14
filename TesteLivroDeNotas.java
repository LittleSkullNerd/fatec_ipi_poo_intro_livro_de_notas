public class TesteLivroDeNotas{
    static public void main(String args []){

//nome completamente qualificado da classe
String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("Digite o nome da disciplina");

        //variavel de referencia, parecido com ponteiro da linguagem C, mas JVM nao tem aritmetica de ponteiro
        //malloc

        // interferencia de tipo "var"
        //var: somente a partir do Java 10
        var livroDeNotas = new LivroDeNotas(nomeDisciplina); //tipo, variavel - new-> operador de criação de objetos
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        //enviando a mensagem "exibirMensagem" ao objeto livro de notas"
        livroDeNotas.exibirMensagem();
        //livroDeNotas.nomeDisciplina = "Portugues";
        System.out.println("A disciplina é " + livroDeNotas.getNomeDisciplina());
        System.out.println("Ate logo");
        livroDeNotas.setNomeDisciplina("Portugues");
    }
}