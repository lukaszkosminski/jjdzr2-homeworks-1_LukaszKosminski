import java.util.Scanner;

public class FirstLetter_extra {

    public static void main(String[] args){
        System.out.println("parametr: ");
        String firstLetter = loadWord().substring(0,1);
        System.out.println("firstLetter : " + firstLetter);
    }
    static String loadWord(){
        Scanner scanner = new Scanner(System.in);
        String textFromLoadWord = scanner.nextLine();
        return textFromLoadWord;
    }
}