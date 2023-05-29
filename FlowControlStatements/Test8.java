package FlowControlStatements;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        /*需求:键盘录入星期数，显示今天的减肥活动
        周一:跑步
        周二:游泳
        周三:慢走
        周四:动感单车
        周五:拳击
        周六: 爬山
        周日:好好吃一顿*/

        //键盘录入今天的星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是周几：");
        String week = sc.next();

        switch (week) {
            case "周一":
                System.out.println("今天的计划是跑步");
                break;
            case "周二":
                System.out.println("今天的计划是游泳");
                break;
            case "周三":
                System.out.println("今天的计划是慢走");
                break;
            case "周四":
                System.out.println("今天的计划是动感单车");
                break;
            case "周五":
                System.out.println("今天的计划是拳击");
                break;
            case "周六":
                System.out.println("今天的计划是爬山");
                break;
            default:
                System.out.println("放纵餐！!");
                break;
        }
    }
}
