package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел для суммирования ");
        int amount = in.nextInt();
        if (amount <= 0) {
            System.out.println("Введите число больше нуля так же для операции \n" +
                    "суммирования должно быт не менее двух ");
        } else if (amount == 1) {
            System.out.println("Тут нечего суммировать, введите число не менее двух ");
        } else {
            int[] ints = new int[amount];
            int g;
            int i = -1;
            int result = 0;
            Random random = new Random();
            System.out.println("Числа для суммирования:  ");
            int k;
            int l;
            while (i < ints.length - 1) {
                g = random.nextInt(1000);
                k = g;
                if (k % 5 == 2 || k % 3 == 1) {
                    l = g;
                    i++;
                    ints[i] = l;
                    System.out.print(ints[i] + ", ");
                }
            }
            for (i = 0; i < ints.length; i++) {
                result = result + ints[i];
            }
            System.out.print("Результат суммирования используя оператор цикла while = " + result + "\n");
            int[] ints2 = new int[amount];
            int x = 0;
            for (i = 0; i < ints2.length; i = x) {
                g = random.nextInt(1000);
                k = g;
                if (g % 5 == 2 || g % 3 == 1) {
                    x++;
                    ints2[i] = k;
                    System.out.print(ints2[i] + ", ");
                }
            }
            int result2 = 0;
            for (i = 0; i < ints.length; i++) {
                result2 = result2 + ints2[i];
            }
            System.out.print("Результат суммирования используя оператор цикла for = " + result2);
        }
    }
}