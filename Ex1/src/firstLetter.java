import java.util.Scanner;
public class firstLetter {

    public static void main(String[] args){
        System.out.println("parametr: ");
        char firstLetter = firstLetter();


        System.out.println("firstLetter : " + firstLetter);


    }
     static char firstLetter(){

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char firstLetter = text.charAt(0);
        return firstLetter;
    }
}