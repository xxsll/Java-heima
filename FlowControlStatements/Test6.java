package FlowControlStatements;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*根据不同的分数送不同的礼物。
        如果是95~100分，送自行车一辆
        如果是90~94分，游乐场玩一天
        如果是80~89分，这变形金刚一个。
        如果是80分以下，揍一顿。*/

        //分析
        Scanner sc = new Scanner(System.in);
        System.out.println("您孩子的分数是");
        int point = sc.nextInt();

        //分数只能在0-100之间
        if (point >= 0 && point <= 100) {

            //1.如果是95~100分，送自行车一辆
            if (point >= 95 && point <= 100) {
                System.out.println("送自行车一辆");
            }

            //2.如果是90~94分，游乐场玩一天
            else if (point >= 90 && point <= 94) {
                System.out.println("游乐场玩一天");
            }

            //3.如果是80-90分
            else if (point >= 80 && point <= 89) {
                System.out.println("送变形金刚一个");
            }

            //4.如果是80分，揍一顿
            else if (point < 80) {
                System.out.println("揍一顿");
            }
        } else {
            System.out.println("成绩输入区间在0-100之间");
        }

    }
}
