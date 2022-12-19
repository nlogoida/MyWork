import java.util.Scanner;

public class OPD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ниже переменнные и расчет задержки сроков
        double OE,OB, AB, OD, CD, ED;
        System.out.println("Плановое время завершения проекта(месяцев): ");
        OE= in.nextInt();//плановое время завершения проекта(месяцев)
        System.out.println("Время точки сегодня (месяцев): ");
        OB=in.nextInt();//время до точки "сегодня"(месяцев)
        System.out.println("Процент завершения проекта на точку сегодня: ");
        AB=in.nextInt();//процент завершения проекта на точку "сегодня"
        CD=100;//все трудозатраты(100%)
        OD=OB*CD/AB;//расчет реального времени проекта(месяцев)
        ED=OD-OE;//расчет ззадержки(месяцев)
        //Ниже переменные и расчет перерасхода бюджета
        double OH, BF, DG, IH;
        System.out.println("Потрачено денег на точку сегодня: ");
        BF=in.nextInt() ;//потрачено денег на точку "сегодня"
        System.out.println("Планируемый бюджет: ");
        OH=in.nextInt() ;//плановый бюджет
        DG=OD*BF/OB;
        IH=(int)Math.ceil(DG-OH);//перерасход бюджета
        System.out.println("Задержка завершения проекта(в месяцах) составит: " + ED);
        System.out.println("Перерасход бюджета(в у.е.) составит: " + IH);
    }
}
