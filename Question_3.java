import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char a = sc.next().charAt(0);
        boolean check = Character.isLetter(a);
        boolean check2 = Character.isLowerCase(a);
        if (check == true) {
            if (check2 == true) {
                System.out.println(Character.toUpperCase(a));
            } else {
                System.out.println(Character.toLowerCase(a));
            }
        } else {
            System.out.println("Not a letter.");
        }
    }
}
