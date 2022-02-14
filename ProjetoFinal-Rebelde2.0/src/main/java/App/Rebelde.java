package App;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Rebelde {

    static IC ic = new IC();

    static Deque<Object> rebeldeCompleto = new LinkedList<>();
    static Scanner leitor = new Scanner(System.in);

    private static String nameRebelde = "";
    private static String racaRebelde = "";
    private static int anwserRaca;
    private static int ageRebelde = 0;

    @Builder
    public static void CadastrarRebelde() {

        System.out.println("\nSeja Bem Vindo Ao Cadastro De Rebeldes!");
        System.out.println("Vamos lá...");
        IC.wait(2000);

        do {
            System.out.println("\nSelecione a Raça: \n1- " + RacaENUMS.GREE + "\n2- " + RacaENUMS.RAKATA + "\n3- " + RacaENUMS.HUMANO);
            anwserRaca = leitor.nextInt();
        } while (anwserRaca > 3 || anwserRaca < 1);

        switch (anwserRaca) {
            case 1:
                racaRebelde = RacaENUMS.GREE.toString();
                break;
            case 2:
                racaRebelde = RacaENUMS.RAKATA.toString();
                break;
            case 3:
                racaRebelde = RacaENUMS.HUMANO.toString();
                break;
            default:
                System.out.println("Erroukkkkkkk");
                System.exit(0);
        }

        do {

            System.out.println("\nPerfeito agora, Digite a idade do rebelde: ");
            ageRebelde = leitor.nextInt();

        } while (ageRebelde < 18 );

        do {

            System.out.println("\nAgora, Digite o nome do rebelde: ");
            nameRebelde = leitor.next();

        } while (nameRebelde == null && nameRebelde.length() == 0);

        rebeldeCompleto.add(racaRebelde);
        rebeldeCompleto.add(nameRebelde);
        rebeldeCompleto.add(ageRebelde);

        ic.IcAceppt((LinkedList) rebeldeCompleto);

    }
}
