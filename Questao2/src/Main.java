import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione qual animal voce deseja escolher:  1 para gato e 2 para cachorro: ");
        int escolha = sc.nextInt();

        switch(escolha){

            case 1:
                Gato gato = new Gato();
                System.out.println("Informe o nome do gato: ");
                gato.setNome(entrada.nextLine());

                System.out.println("Informe a raça: ");
                gato.setRaca(entrada.nextLine());

                System.out.println("Nome do gato: " + gato.getNome());
                System.out.println("Raça: " + gato.getRaca());

                gato.mia();
                gato.caminha();
                break;

            case 2:
                Cachorro cachorro = new Cachorro();
                System.out.println("Informe o nome do cachorro: ");
                cachorro.setNome(sc.nextLine());

                System.out.println("Informe a raça: ");
                cachorro.setRaca(entrada.nextLine());

                System.out.println("Nome do cachorro: " + cachorro.getNome());
                System.out.println("Raça: " + cachorro.getRaca());

                cachorro.late();
                cachorro.caminha();
                break;
        }
        entrada.close();
        sc.close();
    }
}