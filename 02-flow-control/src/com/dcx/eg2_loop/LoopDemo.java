package com.dcx.eg2_loop;

public class LoopDemo {
    public static void main(String[] args) {
        for_test();
        System.out.println("=====================");
        while_test();
        System.out.println("=====================");
        do_while_test();
//        System.out.println(zhedie());
    }

    public static void for_test(){
        for (int i = 1;i < 10;i++ )
            System.out.println(i);
    }

    public static void while_test() {
        int i = 1;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
    }
    public static void do_while_test(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }

    //假设有一张足够大的白纸，初始厚度是0.1mm，请问，需要折多少次，可以折成珠穆朗玛峰的高度（8844.43m = 8844430mm）
    public static int zhedie(){
        double height = 8844430;
        double paper = 0.1;
        int count = 0;
        while(paper < height){
            paper *= 2;
            count ++;
        }
        return count;
    }
}
