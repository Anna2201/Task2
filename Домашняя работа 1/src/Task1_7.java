import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int b;
        int k = 0;
        for (b = 2; k < input; b++) {
            for (int c = 2; c < b; c++) {
                if (b % c == 0) {
                    k++;
                }
            }
            if (k == 0){
                input--;
                if(input == 0) {
                    System.out.println(b);
                }
            }
            /*else {
                System.out.println("No");
            }*/
            k = 0;
            }
        }
    }


