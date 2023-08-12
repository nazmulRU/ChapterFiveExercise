import java.util.Scanner;

public class ThreeNumbersOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a >= b && b >= c) {
            System.out.println("Decreasing");
        } else if (a <= b && b <= c) {
            System.out.println("Increasing");
        } else {
            System.out.println("neither");
        }
    }
}

