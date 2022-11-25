package lr1;

import java.util.Scanner;

public class Example9 {
    private static String Январь;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Выбери месяц: ");
        String mount= in.nextLine();


        if (Январь == mount) {
        System.out.println("Верно!");
        }
        else if (Январь != mount) {
            System.out.println("НЕВерно!");
        }
    }
}
