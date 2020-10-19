import java.util.Scanner;

public class CalcExtra {

    public static void main(String[] args) {
        System.out.println("enter first number: ");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextInt();
        System.out.println("enter second number: ");
        double value2 = scanner.nextInt();
        System.out.println("enter a math symbol ( +, -, *, / ): ");
        String symbol = scanner.next();
        double wynik =calc(value1, value2, symbol);
        System.out.println("Wynik : " + wynik);
    }
    public static double calc(double value1, double value2, String symbol){
        double result=0;
        switch (symbol) {
            case "+": {
                result = value1 + value2;
                break;
            }
            case "-": {
                result = value1 - value2;
                break;
            }
            case "*": {
                result = value1 * value2;
                break;
            }
            case "/": {
                if (value2 == 0) {
                    System.out.println("don't divide by zero, podaj prawidlową wartość");
                }else{
                result = value1 / value2;
                break;
            }}

            default: {
                System.out.println("invalid math symbol!");
            }



        }
        return result;



    }

}