package com.itxxsll.arithmeticoperator;

public class ArithmeticoperatorDemom1 {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);//5
        //-
        System.out.println(5 - 1);//4
        //*(shift+数字8)
        System.out.println(7 * 9);//63

        //如果在计算的时候有小数参与
        //结论：
        //在代码中，如果有小数参与计算，结果有可能不精确的
        //具体原因到讲解JavaSe的时候会详细说明
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
