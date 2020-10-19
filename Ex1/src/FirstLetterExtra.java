import java.util.Scanner;

public class FirstLetterExtra{

    public static void main(String args[]) {
        System.out.println("parametr: ");
        char[] charArray = loadWord_extra().toCharArray();
        char firstFromArray = charArray[0];
        System.out.println("firstLetter : " + firstFromArray);
    }
    static String loadWord_extra() {
        Scanner scanner = new Scanner(System.in);
        String textFromLoadWord = scanner.nextLine();
        return textFromLoadWord;
    }
}