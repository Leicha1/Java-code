package com.dcx.eg1_choose;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        if_test(a);
    }

    public static void if_test(int a){

        if(a > 5){
            System.out.println("a > 5");
        }else if (a == 5){
            System.out.println("a == 5");
        }else{
            System.out.println("a < 5");
        }
    }
}
