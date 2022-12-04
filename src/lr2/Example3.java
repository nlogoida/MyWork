package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа проверит удовлетворяет ли требованиям число - делится на 4 и при этом оно не менее 10");
        System.out.println("Введите число:");
        int A = in.nextInt();
        int B = A % 4;

        if (A>= 10 && B==0){
            System.out.println("Число удовлетворяет ВСЕМ требованиям");}
        else{
            System.out.println("Число НЕ удовлетворяет всем требованиям");}
        if(A >= 10){
            System.out.println("Число не менее 10");}
            if(A < 10){
            System.out.println("Число менее 10");}
            if(B == 0){
            System.out.println("Число делится на 4 без остатка");}
            if(B != 0){
            System.out.println("Число не делится на 4 без остатка");}

in.close();
        }

}

//3. Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число
// следующим критериям: число делится на 4, и при этом оно не меньше 10.