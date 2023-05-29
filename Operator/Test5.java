package Operator;

public class Test5 {
    public static void main(String[] args) {
        /*需求：一座寺庙里住着三个和尚，
        已知他们的身高分别为150cm、210cm、165cm
        请用程序实现获取这三个和尚的最高身高。*/

        //分析：
        //录入三个和尚的身高
        int h1 = 150;
        int h2 = 210;
        int h3 = 165;

        int b1 = h1 > h2 ? h1 : h2;
        int b2 = b1 > h3 ? b1 : h3;

        System.out.println("最高的身高是" + b2);
    }
}
