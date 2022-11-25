package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String SecondName = in.nextLine();

        System.out.println("Введите имя: ");
        String Name = in.nextLine();

        System.out.println("Введите отчество: ");
        String LastName = in.nextLine();

        System.out.println("Hello");
        System.out.println(SecondName);
        System.out.println(Name);
        System.out.println(LastName);
        in.close();

    }

}
