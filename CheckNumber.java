import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 1) {
            System.out.println("Positive number");
        } else if (n < 0) {
            System.out.println("Negative number");
        } else System.out.println("Zero");
    }
}


