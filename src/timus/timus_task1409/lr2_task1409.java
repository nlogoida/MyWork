package timus.timus_task1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class lr2_task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int numberOfCans = a + b - 1;
        int harry = numberOfCans - a;
        int larry = numberOfCans - b;

        out.println(harry + " " + larry);
        out.flush();


    }
}
//Исходные данные
//В единственной строке записано 2 числа — количество банок, простреленных Гарри и Ларри соответственно.
//Результат
//Выведите 2 числа — количество банок, не простреленных Гарри и Ларри соответственно.
//Пример
//исходные данные	результат
//4 7
//6 3