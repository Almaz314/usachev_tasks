package task_2;

import java.util.Scanner;

public class TwoDimensionalArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число строк:\n");
        int rows = input.nextInt();
        System.out.print("Введите число колонок:\n");
        int columns = input.nextInt();

        int[][] myArray = new int[rows][columns];
        int number = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = number;
                number += 2;
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}