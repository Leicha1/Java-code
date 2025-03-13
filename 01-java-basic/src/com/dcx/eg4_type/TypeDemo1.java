package com.dcx.eg4_type;

// 类型转换
// 自动类型转换
// 强制类型转换

public class TypeDemo1 {
    public static void main(String[] args) {
        byte b = 12;
        print(b);  // 自动类型转换 byte -> int
        print2(b); // 自动类型转换 byte -> double

        System.out.println("=========================");

        int a = 12;
//        print3(a); // 类型范围大的变量不可以直接赋值给类型范围小的变量
        // 强制类型转换 (类型) 变量
        print3((byte) a);

        // 强制类型转换可能会导致数据溢出
        int a1 = 128;
        byte b1 = (byte) a1;
        System.out.println(b1);



    }

    public static void print(int b) {
        System.out.println(b);
    }

    public static void print2(double c) {
        System.out.println(c);
    }
    public static void print3(byte b) {
        System.out.println(b);
    }
}
