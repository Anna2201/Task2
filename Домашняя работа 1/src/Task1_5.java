import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a >= b & a >= c) {
            k = k + 1;
        }
        if (b >= a & b >= c) {
            k = k + 1;
        }
        if (c >= a & c >= b) {
            k = k + 1;
        }
        System.out.println(k);
    }
}