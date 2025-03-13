package com.dcx.eg5_input;

import java.util.Scanner;

public class InputDemo1 {
    public static void main(String[] args) {
        getInput();

    }

    //获取键盘输入的数据，并打印
    public static void getInput(){
        // 获取键盘输入的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        // 让程序在这一行暂停，等待用户输入数据，直到用户按下回车键，然后再继续执行
        int a = sc.nextInt();
        System.out.println("您输入的整数是：" + a);

        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("您输入的姓名是：" + name);

        sc.close();
    }


}
