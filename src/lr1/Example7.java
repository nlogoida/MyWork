package lr1;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = in.nextLine();


        System.out.println("Вес: ");
        float weight = in.nextFloat();

        System.out.println("Имя: " +name);
        System.out.println("Вес: " +weight+ " кг");
        in.close();

    }
}
