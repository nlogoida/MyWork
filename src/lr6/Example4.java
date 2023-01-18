package lr6;

public class Example4 {
    public static void main(String[] args){
        DoubleFactorial f = new DoubleFactorial();
        int number = 6;
        System.out.println("Рекурсивный метод");
        int fact = f.fact(number);
        System.out.println("Вычесление двойного фкториала чисел" +number+"!! ="+fact);
        System.out.println("Метод без ркурсии");
        int fact2 = f.fact2(number);
        System.out.println("Вычесление двойного факториала числа" +number+"!! = "+fact2);
    }
    private static class DoubleFactorial{
        private int fact(int n){ //рекурсивный метод
            int result;
            System.out.println("*" +n);
            if (n==1) return 1;// проверка входного параметра, если равен 1, то выходит из метода
            if (n==2) return 2;// проверка входного параметра, если равен 2, то выходит из метода
            result = fact(n-2) * n;
            return result;
        }
        private int fact2(int n){ //метод без рекурсии
            int result = n;
            int j = n;
            for(int i=n; i>2;i=i-2){
                System.out.println("*"+ j);
                j=j-2;
                result *=j;
            }
            return result;
        }
    }
}