import java.util.Scanner;

public class SDACHA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int price = a * 100 + b;
        int paid = c * 100 + d;

        int change = paid - price;

        int rubles = change / 100;
        int kopecks = change % 100;

        System.out.println(rubles + " " + kopecks);
    }
}