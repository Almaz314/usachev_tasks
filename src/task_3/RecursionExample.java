package task_3;

import java.util.Scanner;

public class RecursionExample {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        System.out.println(go(y));
    }

    private static String go(int n) {
        if (n == 1) {
            return "1";
        }else {
            return n + " " + go(n - 1);
        }
    }
}
