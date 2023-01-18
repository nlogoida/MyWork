package lr6;

public class Example6 {
    public static void main(String[] args){
        int[] inArray = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println("Второй аргумент метода меньше длины массива");
        Example_6 myexaple = new Example_6();
        for (int i = 0; i<myexaple.SetArray(inArray, 10).length; i++){
            System.out.println("outArray["+i+"]="+myexaple.SetArray(inArray, 10)[i]);
        }
        System.out.println("Второй аргумент метода больше длины массива");
        Example_6.SetArray(inArray, 25);
        Example_6.viewArray();
    }
    protected static class Example_6{
        private static int outArray[];
        //статический метод, которому аргументом передается целочисленный массив и целое число
        private static int[] SetArray(int inArrae[], int count){
            if(count > inArrae.length){
                count = inArrae.length;
            }
            outArray = new int[count];
            for (int i = 0; i<count; i++){
                outArray[i] = inArrae[i];
            }
            return outArray;//метод возвращает ссылку на новый массив
        }
        private static void viewArray(){
            for (int i=0; i < Example_6.outArray.length; i++){
                System.out.println("outArray["+i+"] ="+outArray[i]);
            }
        }
    }
}