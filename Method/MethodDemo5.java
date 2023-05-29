package Method;

public class MethodDemo5 {
    public static void main(String[] args){
        //目标：掌握带返回值方法的定义和调用格式

        //直接调用 
        getSum(10,20,30);

/*        //赋值调用
        int sum=getSum(1,3,4);
        System.out.println(sum);

        //输出调用
        System.out.println(getSum(1,2,3));*/
        }
    public static int getSum(int a,int b,int c){
        int result=a+b+c;
        return result;
    }
}
