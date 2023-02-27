package task_4;
import java.util.Scanner;

public class CheckWordStartA {
    public static void main(String[] args) {
        String word = getWordWithA();
        System.out.println("Вы ввели слово начинающееcя на 'a': " + word);
    }

    public static String getWordWithA() {
        Scanner input = new Scanner(System.in);
        String word;

        do {
            System.out.print("Введите слово начинающееся на 'а': \n");
            word = input.nextLine();
        } while (!word.startsWith("а"));
        input.close();
        return word;
    }
}
