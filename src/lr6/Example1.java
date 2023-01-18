package lr6;

class Example {
    private char ch;
    private String str;

    public void SetField(char c){
        ch = c;
        System.out.print("\n Вызов метода SetField с аргументом char. ch="+ch);
    }
    public void SetField(String s){
        str = s;
        System.out.print("\n Вызов метода SetField с аргументом string. str="+str);
    }
    public void SetField(char [] CharArray) {
        if (CharArray.length == 1) {
            ch = CharArray[0];
            System.out.print("\n Вызов метода SetField с массивом char. ch=" + ch);
        } else {
            str = new String(CharArray);
            System.out.print("\n Вызов метода SetField с массивом string. str=" + str);
        }
    }
}
public class Example1 {
    public static void main(String[] args){
        Example myex = new Example();
        myex.SetField('A');
        myex.SetField("B");
        char[] CharArray1 = {'п','р','и','в','е','т'};
        char[] CharArray2 = {'C'};
        myex.SetField(CharArray1);
        myex.SetField(CharArray2);
    }
}