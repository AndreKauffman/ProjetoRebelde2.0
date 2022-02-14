package App;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class IC {

    static Scanner leitor = new Scanner(System.in);

    public static void wait(int ms){

        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }

    public void ImprimirRelatorio(LinkedList rebeldeCompleto){

        System.out.println("Adicionei na lista...");
        String fileName = "my-file.txt";
        String encoding = "UTF-8";

        try {
            PrintWriter writer = new PrintWriter(fileName, encoding);
            writer.println(rebeldeCompleto);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public void IcAceppt(LinkedList rebeldeCompleto){

        if (rebeldeCompleto.size() == 3){

            System.out.println("Estamos verificando seu rebelde.......");
            wait(5000);

        }

        Random random = new Random();
        boolean acceptRebelde = random.nextBoolean();

        if(acceptRebelde){

            System.out.println("Opa, seu rebelde foi aceito...");
            ImprimirRelatorio(rebeldeCompleto);

        }else{

            System.out.println("Deu azar, não foi aceito...");

        }
    }
}
