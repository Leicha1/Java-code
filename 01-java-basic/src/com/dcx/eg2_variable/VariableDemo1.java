package com.dcx.eg2_variable;
/*
    变量定义
    数据类型 变量名 = 值;
 */
public class VariableDemo1 {
    public static void main(String[] args) {
        printVariable();
        printVariable2();

    }

    // 变量的定义
    public static void printVariable() {
        // 定义整型变量
        int age = 18;
        System.out.println(age);

        // 定义浮点型变量
        double score = 100.0;
        System.out.println(score);

        // 定义bool型变量
        boolean isMale = true;
        System.out.println(isMale);

        // 定义字符型变量
        char gender = '男';
        System.out.println(gender);

        // 定义字符串型变量
        String name = "dcx";
        System.out.println(name);

        System.out.println("=================");
    }
    // 变量的用法
    public static void printVariable2() {
        int age = 18;
        System.out.println(age);
        age = 19;
        System.out.println(age);
        age = age + 1;
        System.out.println(age);

    }
}
