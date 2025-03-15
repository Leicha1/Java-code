package com.dcx.eg2_loop;

import java.util.Scanner;

public class HuiWen {
    /* 需求：给你一个整数x
     * 如果x是一个回文数，打印true，否则，打印false；
     * 解释：回文数是指正序和倒序读是一样的整数
     * 例如：121是回文数，123不是回文数
     */
    public static void main(String[] args) {
        //1.从键盘获取一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();

        //2.
        System.out.println(isHuiWen(x));


    }
    public static boolean isHuiWen(int x) {
        int temp = x;
        int res = 0;
        while(temp != 0){
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        return res == x;
    }

}
