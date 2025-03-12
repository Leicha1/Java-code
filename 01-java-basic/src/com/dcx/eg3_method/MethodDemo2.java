package com.dcx.eg3_method;
/*
 * 方法重载：同一个类中，方法名相同，参数列表不同，返回值类型可以相同也可以不同
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        print(12);
        print("hello");
        print(12, 34);
    }

    // 定义一个方法 打印一个整数
    public static void print(int a){
        System.out.println(a);
    }
    // 定义一个重载方法 打印字符串
    public static void print(String str){
        System.out.println(str);
    }
    // 定义一个重载方法 打印两个整数之和
    public static void print(int a, int b){
        System.out.println(a + b);
    }
}
