import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto_roboczy3 {
    public static void main(String args[]) throws InterruptedException {

        System.out.println("Witaj w losowaniu lotto ");
       // Random lotto = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres");
        int zakres = scanner.nextInt();




        System.out.println("Podaj ile liczb");
        int ileLiczb = scanner.nextInt();


        Set<Integer> zbior = new TreeSet<>();

        int number = 0;

        while(number < ileLiczb) {

            Random lotto = new Random();
            int liczba = lotto.nextInt(zakres);
            boolean isAdded = zbior.add(liczba);
            if (isAdded == true){
            number++;
            }
            continue;
        }
        System.out.println(zbior.size());
        System.out.println(zbior);



        }
    }





