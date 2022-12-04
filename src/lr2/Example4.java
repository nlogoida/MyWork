package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа проверит попадает ли ваше число в диапазон от 5 до 10 включительно.");
        System.out.println("Введите число:");
        int A = in.nextInt();
        int B = 5;
        int C = 10;

        if(A >= B && A <=C){
            System.out.println("Число: " +A +" попадает в диапазон от 5 до 10" );}
            else System.out.println("Число: " +A +" не попадает в диапазон от 5 до 10");
in.close();
    }
}

//4. Напишите программу, которая проверяет, попадает ли введение пользователем число в диапазон от 5 до 10 включительно.