import java.util.Scanner;
public class Vesokosnyi_Den {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%400==0) {
            System.out.println("YES");
        }
        else if (a%100==0) {
            System.out.println("NO");
        }
        else if (a%4==0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}