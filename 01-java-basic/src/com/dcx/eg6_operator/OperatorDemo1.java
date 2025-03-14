package com.dcx.eg6_operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标 搞清楚基本的算数运算符
//        test1(10,3);
        //三目运算符
        test2(10,20);
        test2(60);

    }
    public static void test1(int a,int b){

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);              // 输出结果是整数
        System.out.println(1.0 * a / b);        // 输出结果是浮点数
        System.out.println((double) a / b);     // 输出结果是浮点数
        System.out.println(a % b);

    }

    // 三目运算符
    public static void test2(int a,int b){
        int max = a > b ? a : b;
        System.out.println("较大值为：" + max);
    }
    public static void test2(int score){
        String result = score >= 60 ? "及格" : "不及格";
        System.out.println("成绩" + result);
    }
}
