import java.util.Scanner;
import java.lang.Math;
public class Question_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = sc.nextInt();
        System.out.print("Enter Operation (+ - * / % ^): ");
        String operator = sc.next();
        System.out.print("Enter number y: ");
        int y = sc.nextInt();
        double z = 0;
        switch (operator) {
            case "+":
                z = x + y;
                break;
            
            case "-":
                z = x - y;
                break;

            case "*":
                z = x * y;
                break;

            case "/":
                z = x / y;
                break;

            case "%":
                z = x % y;
                break;

            case "^":
                z = Math.pow(x, y);
                break;

            default:
            System.out.println("You enter wrong operator");
                break;
        }
    System.out.println(z);
    sc.close();
    }
}