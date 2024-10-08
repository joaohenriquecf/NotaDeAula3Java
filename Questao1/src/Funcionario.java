import java.util.Scanner;
public class Funcionario {
    String nome;
    int nasc;
    double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, int nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double informarSalario() {
        return salario;
    }

    public int calcularIdade() {
        return 2024 - nasc;
    }
}
