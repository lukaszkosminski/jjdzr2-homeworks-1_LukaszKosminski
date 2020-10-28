import java.util.*;

public class Lotto_roboczy4 {
    public static void main(String args[]) throws InterruptedException {

        System.out.println("Witaj w losowaniu lotto ");
       // Random lotto = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres");
        int zakres = scanner.nextInt();
        try{

                      System.out.println("podanypoprawny zakres");

        }catch(InputMismatchException e){
            System.out.println("podano niepoprawny zakres");
        }



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
        System.out.println(zbior\n);



        }
    }





