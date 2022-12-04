package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа проверит сколько тысяч во введеном вами числе.");
        System.out.println("Введите число: ");

        int A = in.nextInt();
        int B = A/1000;
        if (B >= 1){
            System.out.println("Колличество тысяч в вашем числе: " +B);}
        else System.out.println("В вашем числе нет тысяч");
in.close();
    }
}
//5. Напишите программу, которая проверяет, сколько тысяч во введенном
// пользователем числе (определяется четвертая цифра справа в десятичном представлении числа).