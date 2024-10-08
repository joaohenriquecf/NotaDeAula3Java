import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual seria o funcionário: 1 para Gerente e 2 para Programador ");
        int choose = entrada.nextInt();

        switch (choose) {

            case 1:
                Gerente gerente = new Gerente();

                System.out.println("Digite o nome do Gerente: ");
                gerente.setNome(sc.nextLine());

                System.out.println("Digite o ano em que nasceu: ");
                gerente.setNasc(entrada.nextInt());

                System.out.println("Digite o salário: ");
                gerente.setSalario(entrada.nextDouble());

                System.out.println("Informe o projeto: ");
                gerente.setProjeto(sc.nextLine());

                System.out.println("Informaçoes do Gerente: ");
                System.out.println("Nome: " + gerente.nome);
                System.out.println("Idade: " + gerente.calcularIdade() + " anos");
                System.out.println("Salário: R$ " + gerente.informarSalario());
                System.out.println("Projeto: " + gerente.informarProjeto());
                break;

            case 2:
                Programador programador = new Programador();

                System.out.println("Digite o nome do programador: ");
                programador.setNome(sc.nextLine());

                System.out.println("Digite o ano em que nasceu: ");
                programador.setNasc(entrada.nextInt());

                System.out.println("Digite o salário: ");
                programador.setSalario(entrada.nextDouble());

                System.out.println("Informe a linguagem que o programador trabalha: ");
                programador.setLinguagem(sc.nextLine());

                System.out.println("Informaçoes do Gerente: ");
                System.out.println("Nome: " + programador.nome);
                System.out.println("Idade: " + programador.calcularIdade() + " anos");
                System.out.println("Salário: R$ " + programador.informarSalario());
                System.out.println("Linguagem: " + programador.informarlinguagem());
                break;
        }
        entrada.close();
        sc.close();
    }
}