import java.util.*;
import java.io.*;
public class Main {
    // There are like 6 possible cases and they are mostly easy.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("paint.in"));
        PrintWriter pw = new PrintWriter("paint.out");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        boolean higher = (b > c) && (a < d);

        if (a == c && b == d) {
            pw.println(d - c);
            pw.close();
            System.exit(0);
        }

        if (a < c && b >= d) {
            pw.println(b-a);
        } else if (a > c && b < d) {
            pw.println(d - c);
        } else if (higher && b > d) {
            pw.println(b - c);
        } else if (higher && b < d) {
            pw.println(d - a);
        } else {
            pw.println((b-a) + (d-c));
        }
        System.out.println(higher);
        pw.close();
    }
}