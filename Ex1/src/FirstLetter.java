import java.util.Scanner;

public class FirstLetter {

    public static void main(String[] args) {
        System.out.println("parametr: ");
        char firstLetter = loadWord().charAt(0);
        System.out.println("firstLetter : " + firstLetter);
    }
    
    public static String loadWord() {
        Scanner scanner = new Scanner(System.in);
        String textFromLoadWord = scanner.nextLine();
    
        return textFromLoadWord;
    }
}
