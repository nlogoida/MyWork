package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = in.nextLine();


        System.out.println("Возраст: ");
        int лет = in.nextInt();

        System.out.println("Имя: " +name);
        System.out.println("Возраст: " +лет);
        in.close();

    }
}
