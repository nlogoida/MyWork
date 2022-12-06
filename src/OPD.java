import java.util.Scanner;

public class OPD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ниже переменнные и расчет задержки сроков
        double OE,OB, AB, OD, CD, ED, result1;
        OE=2;//плановое время завершения проекта(месяцев)
        OB=1;//время точки "сегодня"(месяцев)
        AB=40;//процент завершения проекта на точку "сегодня"
        CD=100;//все трудозатраты(100%)
        OD=OB*CD/AB;//расчет реального времени проекта(месяцев)
        result1=OD-OE;//расчет ззадержки(месяцев)
        System.out.println("Задержка завершения проекта(в месяцах) составит: " + result1);

        //Ниже переменные и расчет перерасхода бюджета
        double OH, Z, BF, DG2, DG, IH;
        Z=40000 ;//потрачено денег на точку "сегодня"
        OH=60000 ;//плановый бюджет
        BF=Z/OH*100;//расчет процента потраченного бюджета на точку "сегодня"
        DG=OD*(BF/OB);//оценка всего бюджета в %
        DG2=(OH/100)*DG;
        int result2=(int)Math.ceil(DG2-OH);//перерасход бюджета
        System.out.println("Перерасход бюджета(в у.е.) составит: " + result2);
    }
}
