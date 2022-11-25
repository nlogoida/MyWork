package lr1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваше имя: ");
        String Name = in.nextLine();

        System.out.println("Введите Ваш год рождения: ");
        int num = in.nextInt();
        int years = LocalDateTime.now().getYear() - num;

        System.out.println("Name: " + Name);
        System.out.println("Вас зовут: " + Name + ", ваш возраст: " + years);
        in.close();



    }
}