import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a >= b && b >= c) {
            System.out.println("in order");
        } else if (a <= b && b <= c) {
            System.out.println("in order");
        } else {
            System.out.println("not in order");
        }
    }
}
