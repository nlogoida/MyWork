package timus.timus_task1000;

import java.io.PrintWriter;
import java.util.Scanner;

public class lr2_task1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();

        int result = a+b;

        out.println(result);
        out.flush();
    }
}