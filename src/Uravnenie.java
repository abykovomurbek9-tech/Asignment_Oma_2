import java.util.Scanner;

public class Uravnenie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            int x = -b / a;

            if (-b % a == 0) {
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        }
    }
}