import java.util.Random;
import java.util.Scanner;

public class Lotto{
    public static void main(String args[]) {

        Random lotto = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres");
        int zakres = scanner.nextInt();
        System.out.println("Podaj ile liczb");
        int ileLiczb = scanner.nextInt();



        int liczba = lotto.nextInt(zakres)+1;
        System.out.println("wylosowana liczba " + liczba);
        int [] myTable = new int[ileLiczb+1];


       //do {

      // }





    }


}