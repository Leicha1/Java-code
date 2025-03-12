package com.dcx.eg3_method;
/*
* 方法的定义
 */
public class MethodDemo {
    public static void main(String[] args) {
        int sum = getSum(10, 20);
        System.out.println("和是：" + sum);

    }

    //定义一个方法，返回任意两个整数的和
    public static int getSum(int a, int b) {
        return a + b;
    }


}
