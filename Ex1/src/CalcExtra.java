import java.util.Scanner;

public class CalcExtra {

    public static void main(String[] args){
        System.out.println("enter first number: ");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextInt();
        System.out.println("enter second number: ");
        double value2 = scanner.nextInt();
        System.out.println("enter a math symbol ( +, -, *, / ): ");
        String symbol = scanner.next();
        if (value2 == 0 && symbol.equals("/")) {
            System.out.println("don't divide by zero");
        }else if(!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("/") && !symbol.equals("*")){
            System.out.println("invalid math symbol!");
        }else{
            double wynik =calc(value1, value2, symbol);
            System.out.println("Wynik : " + wynik);
        }
    }
    public static double calc(double value1, double value2, String symbol){
        double result=0;
        switch (symbol) {
            case "+": {
                return  value1 + value2;
            }
            case "-": {
                return  value1 - value2;
            }
            case "*": {
                return value1 * value2;
            }
            case "/": {
                return value1 / value2;
            }
        }
        return result;
    }
}