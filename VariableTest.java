public class VariableTest {
    //主入口
    public static void main(String[] args){
        //一开始没有乘客
        int count = 0;
        //第一站：上去一位乘客
        count = count + 1;
        System.out.println("第一站的乘客为"+count);
        //第二站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        System.out.println("第二站的乘客为"+count);
        //第三站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        System.out.println("第三站的乘客为"+count);
        //第四站：下来一位乘客
        count = count - 1;
        System.out.println("第四站的乘客为"+count);
        //第五站：上去一位乘客
        count = count + 1;
        System.out.println("第五站的乘客为"+count);

    }
}
