package task_5;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GreetingMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("ВВедите время дня в формате чч:мм: ");
        String inputTime = scanner.nextLine();
        LocalTime time = LocalTime.parse(inputTime, DateTimeFormatter.ofPattern("HH:mm"));




        String greeting;
        if (time.isAfter(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(11, 0))) {
            greeting = "“Доброе утро,";
        } else if (time.isAfter(LocalTime.of(11, 0)) && time.isBefore(LocalTime.of(17, 0))) {
            greeting = "Добрый день";
        } else if (time.isAfter(LocalTime.of(17, 0)) && time.isBefore(LocalTime.of(22, 0))) {
            greeting = "Добрый вечер";
        } else {
            greeting = "Доброй ночи";
        }


        System.out.println(greeting + ", " + name);
    }
}
