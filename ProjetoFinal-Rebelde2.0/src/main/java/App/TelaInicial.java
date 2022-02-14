package App;

import java.util.Scanner;

public class TelaInicial {

    private String nameUser;
    private int anwserUser;

    Scanner leitor2 = new Scanner(System.in);

    public void InterfaceSeleção(){

        do {

            System.out.println("Digite Seu Nome: ");
            nameUser = leitor2.nextLine();

        } while (nameUser.length() == 0);

        System.out.println("\nOlá " + nameUser + ", Seja Bem Vindo a Seleção!");

        do {

            System.out.println("\nO que deseja?");
            System.out.println("1- Cadastrar \n2- Sair");
            anwserUser = leitor2.nextInt();

        } while (anwserUser != 1 && anwserUser != 2);


        switch (anwserUser){

            case 1:
                Rebelde.CadastrarRebelde();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.exit(0);

        }
    }

}
