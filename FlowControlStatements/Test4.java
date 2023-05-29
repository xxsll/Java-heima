package FlowControlStatements;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*假设，用户在超市实际购买，商品总价为: 600元。
        键盘录入一个整数表示用户实际支付的钱。
        如果付款大于等于600，表示付款成功。否则付款失败。*/

        //分析1
        //键盘录入一个整数表示用户实际支付的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("用户支付多少元：");
        int payment = sc.nextInt();

        //分析2
        //如果付款大于等于600
        if (payment >= 600) {
            System.out.println("支付成功");
        }

        //否则付款失败
        else {
            System.out.println("付款失败");
        }
    }
}
