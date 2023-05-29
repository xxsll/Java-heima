package FlowControlStatements;

public class Test2 {
    public static void main(String[] args){
        /*汽车无人驾驶会涉及到大量的判断
        * 当汽车行驶遇到了红绿灯，就会进行判读
        * 如果红灯亮，就停止
        * 如果绿灯亮，就行驶*/

        //定义三个变量表示灯的状态
        //true亮 false灭
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        //2.判断//红灯亮，就停止//黄灯亮，就减速//绿灯亮，就行驶
        if(isLightGreen){
            System.out.println("GOGOGO!");
        }

        if(isLightRed){
            System.out.println("Stop!!");

        }

        if(isLightYellow){
            System.out.println("Slow!!");
        }

    }
}
