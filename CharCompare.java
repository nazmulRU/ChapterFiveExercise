import java.util.Scanner;

public class CharCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String fc, lc;
        fc = str.substring(0, 1);
        lc = str.substring(str.length() - 1, str.length());
        if (fc.equals(lc)) {
            System.out.println("first and last letter same");
        } else System.out.println("first and last letter different");
    }
}

