import java.util.*;

public class Lotto_roboczy {
    public static void main(String args[]) throws InterruptedException {

        System.out.println("Witaj w losowaniu lotto ");
        Random lotto = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres");
        int zakres = scanner.nextInt();
        System.out.println("Podaj ile liczb");
        int ileLiczb = scanner.nextInt();


        int liczba = lotto.nextInt(zakres) + 1;
        System.out.println("wylosowana liczba " + liczba);

        Set<Integer> zbior = new TreeSet<>();

        //zbior.add(liczba);
       // zbior.add(liczba +78);
        //zbior.add(liczba +23);

        for(int i=0; i<ileLiczb; i++){

             // boolean isAdded = zbior.add(liczba);
            zbior.add(liczba);
        }
        System.out.println(zbior.size());

        // System.out.println(zbior.size()); // ilosc elementów
        // System.out.println(zbior.contains(liczba)); // czy zawiera element w zbiorze

       // for(Integer e : zbior){
       //     System.out.print(e + " ");
      //      Thread.sleep(1000);
      //  }



        }
    }





