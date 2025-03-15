package com.dcx.eg2_loop;

import java.util.Scanner;

public class ShangYu {
    /*
     * 需求：给定一个除数与被除数（都为正整数），将两数相除，要求不使用乘法、除法与%运算符，并且要求输出商与余数。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数:");
        int beichushu = sc.nextInt();

        System.out.println("请输入除数:");
        int chushu = sc.nextInt();
        int shang = 0,yushu = 0;
        while(beichushu >= chushu){
            beichushu = beichushu - chushu;
            shang++;
        }
        yushu = beichushu;
        System.out.println(shang);
        System.out.println(yushu);
    }
}
