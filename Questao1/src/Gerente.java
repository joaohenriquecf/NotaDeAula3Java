public class Gerente extends Funcionario{
    String projeto;

    public Gerente() {
        super();
    }

    public Gerente(String nome, int nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto =  projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String informarProjeto(){
        return projeto;
    }
}