import java.util.Scanner;

public class KING {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if (Math.abs(x1 - x2) <= 1 &&
                Math.abs(y1 - y2) <= 1 &&
                (x1 != x2 || y1 != y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}