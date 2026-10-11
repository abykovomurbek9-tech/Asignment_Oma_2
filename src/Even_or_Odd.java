import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a % 2 == 0 || b % 2 == 0 || c % 2 == 0) &&
                (a % 2 != 0 || b % 2 != 0 || c % 2 != 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}