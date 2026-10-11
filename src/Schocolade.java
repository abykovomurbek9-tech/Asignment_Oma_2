import java.util.Scanner;

public class Schocolade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        if (k % n == 0 && k / n < m ||
                k % m == 0 && k / m < n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}