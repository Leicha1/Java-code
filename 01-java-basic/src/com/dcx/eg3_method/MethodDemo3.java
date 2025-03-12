package com.dcx.eg3_method;
/*
 * 在无返回值的方法中使用return提前结束方法调用
 */
public class MethodDemo3 {
    public static void main(String[] args) {
    print(12, 0);
    }

    //定义一个有参无返回值的方法
    public static void print(int a, int b) {
        System.out.println("a = " + a);
        if(b==0)
            return; //提前结束方法调用, 不再执行后续代码
        System.out.println("b = " + b);
    }

}
