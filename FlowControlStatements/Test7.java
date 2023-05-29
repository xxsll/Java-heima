package FlowControlStatements;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*在实际开发中，多种情况判断时，会用到if的第三种格式:
        需求:
        商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
        假设商品总价为1000.
        键盘录入会员级别，并计算出实际支付的钱。
        会员1级:打9折。
        会员2级:打8折。
        会员3级:打7折。
        非会员:不打折，要打也是打骨折。*/

        //商品总价进行声明
        int total = 1000;

        //键盘录入会员级别，并计算出实际支付的钱。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级：");
        int standard = sc.nextInt();

        //会员只有1到3级
        if (standard >= 0 && standard <= 3) {
            //会员1级：打九折
            if (standard == 1) {
                double finalstandard = total * 0.9;
                System.out.println("已为您优惠九折，您的商品总价为:" + finalstandard);
            }

            //会员2级：打八折
            else if (standard == 2) {
                double finalstandard = total * 0.8;
                System.out.println("已为您优惠八折，您的商品总价为:" + finalstandard);
            }

            //会员2级：打八折
            else if (standard == 3) {
                double finalstandard = total * 0.7;
                System.out.println("已为您优惠七折，您的商品总价为:" + finalstandard);
            } else if (standard == 0) {
                System.out.println("您没有优惠，您的商品总价为:" + total);
            }
        } else {
            System.out.println("请您输入正确的会员等级！");
        }
    }
}
