package main;
import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
        System.out.println("podaj pierwszą liczbę: ");
        Scanner scanner = new Scanner(System.in);
        double liczba1 = scanner.nextInt();
        System.out.println("podaj drugą liczbę: ");
        double liczba2 = scanner.nextInt();
        System.out.println("podaj symbol działania: ");
        String symbol = scanner.next();

        switch (symbol) {
            case "+": {
                int wynik = (int)liczba1 + (int)liczba2;
                System.out.println("Wynik działania: " + wynik);
                break;
            }
            case "-": {
                int wynik = (int)liczba1 - (int)liczba2;
                System.out.println("Wynik działania: " + wynik);
                break;
            }
            case "*": {
                int wynik = (int)liczba1 * (int)liczba2;
                System.out.println("Wynik działania: " + wynik);
                break;
            }
            case "/": {
                double wynik = liczba1 / liczba2;
                System.out.println("Wynik działania: " + wynik);
                break;
            }
            default: {
                System.out.println("naucz sie symboli dzialań matematycznych!");
            }

        }

    }
}