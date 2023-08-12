import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String fc, lc;
        fc = str.substring(0, str.length() / 2);
        lc = str.substring(str.length() / 2, str.length());
        if (fc.equals(lc)) {
            System.out.println("first and second half same");
        } else System.out.println("first and second half different");
    }
}
    
