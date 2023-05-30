package ObjectOriented;

public class PhoneTest {
    public static void main(String[] args){
        //创建手机对象
        Phone p=new Phone();

        //给手机中的对象赋值
        p.brand="苹果";
        p.price=6000;

        //调用手机中的对象
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();

        //创建手机对象2
        Phone p2=new Phone();
        p2.brand="小米";
        p2.price=4000;



    }
}
