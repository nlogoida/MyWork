public class Test {
    //Продемонстрировать область видимости блока кода
    public static void main(String[] args) {
        int х; // эта переменная доступна всему коду из метода main(
        х = 10;
        if (х == 10) { // начало новой области действия,
            int у = 20; //доступной только этому блоку кода
// обе переменные х и у доступны в
//этой области действия
            System.out.println("x и у: " + х + " " + у);
            х = у * 2;
        }

        System.out.println("x равно " + х);
    }
}