import java.util.Scanner;
public class Question_2_1 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanIn.nextInt();
        for (int i = 0; i  <  n; i++) {
            for (int j = 0; j  <  n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
