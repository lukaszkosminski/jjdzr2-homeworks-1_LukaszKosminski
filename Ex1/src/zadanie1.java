package main;
import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("parametr: ");
        String a = scanner.nextLine();
        char pierwszaLitera = a.charAt(0);

        System.out.println("parametr - pierwszaLitera : " + pierwszaLitera);
    }
}