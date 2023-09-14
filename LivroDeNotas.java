public class LivroDeNotas{
    //variavel de instancia
    //instancia é sinonimo de objeto 
    String nomeDisciplina;

    public void exibirMensagem (){
        System.out.printf("Bem vindo ao livro de notas %s\n ", nomeDisciplina);
    } 


//construtor padrão (aquele cuja lista de parametros e vazia)
LivroDeNotas(String nomeDisciplina){
    //shadowing
    this.nomeDisciplina = nomeDisciplina;


    }
}