public class TesteLivroDeNotas{
    static public void main(String args []){
        //variavel de referencia, parecido com ponteiro da linguagem C, mas JVM nao tem aritmetica de ponteiro
        //malloc
        LivroDeNotas livroDeNotas = new LivroDeNotas(); //tipo, variavel - new-> operador de criação de objetos
        livroDeNotas.exibirMensagem();
        System.out.println("Ate logo");
    }
}