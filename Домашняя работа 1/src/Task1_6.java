import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        int s=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        if ((a == 1) | (a == 0)) {
            s=0;
        }
        if (a>1) {
            s=a-1;
        }
        if (a<0) {
            s=s-a;
        }
        System.out.println(s);
    }
}
