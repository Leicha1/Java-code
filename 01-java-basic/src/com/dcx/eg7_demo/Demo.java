package com.dcx.eg7_demo;

import java.util.Scanner;

/*
    开发一个简单的健康计算器应用程序，
    要求：可以接收用户的输入（姓名、年龄、性别、体重、身高），并根据用户的输入
    计算出用户的身体质量指数（BMI）和基础代谢率（BMR），并给出对应的健康状态提示。
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的姓名：");
        String name = sc.next();

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入您的性别（1：男，2：女）：");
        int sex = sc.nextInt();

        System.out.println("请输入您的体重（kg）：");
        double weight = sc.nextDouble();

        System.out.println("请输入您的身高（cm）：");
        double height = sc.nextDouble();
        sc.close();

        double bmi = getBMI(weight,height);
        System.out.println(name + "的BMI为：" + bmi);

        double bmr = getBMR(age,sex,weight,height);
        System.out.println(name + "的BMR为：" + bmr);

        if(bmi < 18.5){
            System.out.println(name + "您的BMI值过低，请考虑减肥。");
        }else if(bmi >= 18.5 && bmi < 24.9){
            System.out.println(name + "您的BMI值正常，继续保持。");
        }else if(bmi >= 24.9 && bmi < 29.9){
            System.out.println(name + "您的BMI值有点高，请考虑减肥。");
        }

        if(bmr < 500){
            System.out.println(name + "您的BMR值过低，请考虑增肌。");
        }else if(bmr >= 500 && bmr < 800){
            System.out.println(name + "您的BMR值正常，继续保持。");
        }else if(bmr >= 800 && bmr < 1200){
            System.out.println(name + "您的BMR值有点高，请考虑增肌。");
        }
    }
    //创建方法，根据用户的输入，计算出BMI
    public static double getBMI(double weight,double height){
        return weight / (height/100 * height/100);
    }
    //创建方法，根据用户的输入，计算出BMR
    public static double getBMR(int age,int sex,double weight,double height){
        double bmr = 0;
        if(sex == 1){
            bmr = 66 + (13.7 * weight) + (5 * height / 100) - (6.8 * age);
        }else if(sex == 2){
            bmr = 655 + (9.6 * weight) + (1.8 * height / 100) - (4.7 * age);
        }
        return bmr;
    }

}
