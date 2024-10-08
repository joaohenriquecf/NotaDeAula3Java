public class Animal {
    private String nome;
    private String raca;

    public Animal() {
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void caminha() {
        System.out.println("Animal esta caminhando em sua direçao! ");
    }
}
