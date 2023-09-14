public class LivroDeNotas{
    //variavel de instancia
    //instancia é sinonimo de objeto 
    //modificador de acesso
    //encapsulamento
    private String nomeDisciplina;
    //metodos getters/setters
    //principio do menor privilegio
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    //setter
    public void set nomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void exibirMensagem (){
        System.out.printf("Bem vindo ao livro de notas %s\n ", nomeDisciplina);
    } 


//construtor padrão (aquele cuja lista de parametros e vazia)
LivroDeNotas(String nomeDisciplina){
    //shadowing
    this.nomeDisciplina = nomeDisciplina;


    }
}