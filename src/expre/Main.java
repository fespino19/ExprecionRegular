package expre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        String l1;

        FileReader fr = new FileReader("santako.txt");

        BufferedReader br = new BufferedReader(fr);

        l1= br.readLine();

        Pattern psanta = Pattern.compile("\\*<]:-DOo");
        Pattern prenos = Pattern.compile(">:o\\)");
        Pattern payuda = Pattern.compile("[^*]<]:-D");

        int contadorS = 0;
        int contadorR = 0;
        int contadorA = 0;
        int conLinea = 1;

        while (l1 != null){
            String linea ="Linea("+conLinea+")";
            System.out.println(linea);

            Matcher msanta = psanta.matcher(l1);
            Matcher mrenos = prenos.matcher(l1);
            Matcher mayuda = payuda.matcher(l1);

            if (msanta.find()){
                contadorS++;
                System.out.println("Santa:"+contadorS);
            }

            if (mrenos.find()){
                contadorR++;
                System.out.println("Renos:"+contadorR);
            }

            if (mayuda.find()){
                contadorA++;
                System.out.println("Ayudantes:"+contadorA);
            }

            l1= br.readLine();
            conLinea++;
            System.out.println("-----------------------");
        }

    }
}
