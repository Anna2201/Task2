import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a==b || b==c || c==a){
            System.out.println("Есть");
        }
        else {
            System.out.println("Нет");
        }
    }
}