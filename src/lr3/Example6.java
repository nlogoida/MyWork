package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ints = new int[n + 1];
        if (n >= 0) {
            int g = 0;
            int i = 0;
            System.out.println("Сечас будут выведены числа\n" +
                    "которые при делении на 5 дают в остатке 2: ");
            while (i < ints.length - 1) {
                g++;
                if (g % 5 == 2) {
                    i ++;
                    ints[i] = g;
                    System.out.print(ints[i] + "\t");
                }
            }

        } else System.out.println("размер массива не может быть нулевым или отрицательным");
    }
}