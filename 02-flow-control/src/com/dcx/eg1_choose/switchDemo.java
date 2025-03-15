package com.dcx.eg1_choose;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("今天是周几？");
        String week = sc.next();
        switch_test(week);
        switch_test2(week);
        switch_test3(week);
    }


    public static void switch_test(String week) {

        switch (week) {
            case "周一":
                System.out.println("周一要去跑步");
                break;
            case "周二":
                System.out.println("周二要去游泳");
                break;
            case "周三":
                System.out.println("周三要去爬山");
                break;
            case "周四":
                System.out.println("周四要去看电影");
                break;
            case "周五":
                System.out.println("周五要去打游戏");
                break;
            default:
                System.out.println("周六日休息");
                break;

        }
    }
    // switch新特性
    public static void switch_test2(String week) {
        switch (week){
            case "周一" -> System.out.println("周一要去跑步");
            case "周二" -> System.out.println("周二要去游泳");
            case "周三" -> System.out.println("周三要去爬山");
            case "周四" -> System.out.println("周四要去看电影");
            case "周五" -> System.out.println("周五要去打游戏");
            default -> System.out.println("周六日休息");

        }
    }

    //
    public static void switch_test3(String week){
        switch(week){
            case "周一","周二","周三","周四","周五" -> System.out.println("今天是工作日");
            default -> System.out.println("今天是休息日");

        }

    }
}
