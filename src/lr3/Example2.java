package lr3;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        System.out.println("Введи название дня недели: ");
        Scanner in = new Scanner(System.in);
        String dayOfWeek = in.nextLine();
        String s = dayOfWeek.toLowerCase();
        System.out.println("Результат выполнения кода с использованием оператора выбора switch.\n");
        switch (s) {
            case "понедельник", "пн":
                System.out.println("Вы ввели: Понедельник, порядковый номер - 1");
                break;
            case "вторник", "вт":
                System.out.println("Вы ввели: Вторник, порядковый номер - 2");
                break;
            case "среда", "ср":
                System.out.println("Вы ввели: Среда, порядковый номер - 3");
                break;
            case "четверг", "чт":
                System.out.println("Вы ввели: Четверг, порядковый номер - 4");
                break;
            case "пятница", "пт":
                System.out.println("Вы ввели: Пятница, порядковый номер - 5");
                break;
            case "суббота", "сб":
                System.out.println("Вы ввели: Суббота, порядковый номер - 6");
                break;
            case "воскресенье", "вс":
                System.out.println("Вы ввели: Воскресенье, порядковый номер - 7");
            default:
                System.out.println("\n такого дня нет, проверьте введенные данные");
        }
        System.out.println("\nА это результат выполнения кода\n с использованием вложенных условных операторов.\n");

        if (s.equals("понедельник") || s.equals("пн")) {
            System.out.println("Вы ввели: Понедельник, порядковый номер - 1");
        } else if (s.equals("вторник") || s.equals("вт")) {
            System.out.println("Вы ввели: Вторник, порядковый номер - 2");
        } else if (s.equals("среда") || s.equals("ср")) {
            System.out.println("Вы ввели: Среда, порядковый номер - 3");
        } else if (s.equals("четверг") || s.equals("чт")) {
            System.out.println("Вы ввели: Четверг, порядковый номер - 4");
        } else if (s.equals("пятница") || s.equals("пт")) {
            System.out.println("Вы ввели: Понедельник, порядковый номер - 5");
        } else if (s.equals("суббота") || s.equals("сб")) {
            System.out.println("Вы ввели: Суббота, порядковый номер - 6");
        } else if (s.equals("воскресенье") || s.equals("вс")) {
            System.out.println("Вы ввели: Воскресенье, порядковый номер - 7");
        } else System.out.println("\nтакого дня нет, проверьте введенные данные");
    }
}