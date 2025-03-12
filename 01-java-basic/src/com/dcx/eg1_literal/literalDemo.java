package com.dcx.eg1_literal;

/*
 * 掌握常见字面量的书写格式
 */

public class literalDemo {
    public static void main(String[] args) {
        printLiteral();

    }

    public static void printLiteral() {
        //直接输出常用自面量
        //1.整型
        System.out.println(100);
        //2.浮点型
        System.out.println(3.14);
        //3.布尔型
        System.out.println(true);
        System.out.println(false);
        //4.字符型,使用单引号，引号中字符有且只能有一个
        System.out.println('a');
        System.out.println('邓');
        //5.字符串型,使用双引号，引号中可以包含多个字符
        System.out.println("hello world");
        System.out.println("你好");
        //6.特殊字符
        System.out.println("你好\n世界");   // \n换行
        System.out.println("你好\t世界");   // \t制表符



    }


}
