package FlowControlStatements;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){

        /*在实际开发中，电影院选座也会使用到if判断。
        假设某影院售卖了100张票，票的序号为1~100。
        其中奇数票号坐左侧，偶数票号坐右侧。
        键盘录入一个整数表示电影票的票号。
        根据不同情况，给出不同的提示:
        如果票号为奇数，那么打印坐左边
        如果票号为偶数，那么打印坐右边。
         */

        //录入一个整数表示电影票的票号
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入票号");
        int number= sc.nextInt();
        int number2=number%2;

        //票的序号为1~100
        if(number>=1&&number<=100){
            //如果票号为奇数，那么打印坐左边
            if(number2==0){
                System.out.println("坐右侧");
            }else{
                System.out.println("坐左侧");
            }

        }else{
            System.out.println("请输入1-100的票号！");
        }
    }
}
