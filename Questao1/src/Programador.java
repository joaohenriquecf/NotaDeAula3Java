public class Programador extends Funcionario{
    String linguagem;

    public Programador(){
        super();
    }

    public Programador(String nome, int nasc, double salario) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String informarlinguagem() {
        return linguagem;
    }
}
