package com.aj.jdbc;

import java.util.Random;
import java.util.Scanner;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/18 10:05
 */
public class triger {
    public static void main(String[] args){
        // 两者比较
        /** int a=180;
        int b=200;

        if (a==b){
            System.out.println("两只老虎一样重");
        }
        else {
            System.out.println(" 我呸");
        }
         */
        // 三者键入
        /**
        Scanner sc=new Scanner(System.in);

        System.out.println("第一个的身高");
        int a=sc.nextInt();

        System.out.println("第二个的身高");
        int b=sc.nextInt();

        System.out.println("第三个的身高");
        int c=sc.nextInt();

        int xiaomax=a>b? a:b;

        int max=c>xiaomax? c:xiaomax;

        System.out.println("最高是："+max+"cm");
         */

        //春夏秋冬

        /**
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个月份");

        int month=sc.nextInt();

        switch (month){
            case 1:System.out.println("冬天");break;
            case 2:System.out.println("冬天");break;
            case 3:System.out.println("冬天");break;

            case 4:System.out.println("春天");break;
            case 5:System.out.println("春天");break;
            case 6:System.out.println("春天");break;

            case 7:System.out.println("夏天");break;
            case 8:System.out.println("夏天");break;
            case 9:System.out.println("夏天");break;

            case 10:System.out.println("秋天");break;
            case 11:System.out.println("秋天");break;
            case 12:System.out.println("秋天");break;
        }
         */

        //珠穆朗玛峰！
        /**
        int count=0;
        double paper=0.1;
        int zzlmf=884430;

        while (paper<=zzlmf){
            paper=paper*2;
              count++;
        }
        System.out.println("折几次"+count);
         */
        //猜数字
        Random r=new Random();
        int number=r.nextInt(100)+1;

        while (true){
            Scanner sc=new Scanner(System.in);

            System.out.println("你猜的：");
            int guessNumber=sc.nextInt();

            if (number >guessNumber){
                System.out.println(guessNumber+"猜少了");
            }
            else if(number<guessNumber){
                System.out.println(guessNumber+"猜多了");
            }
            else  {
                System.out.println(guessNumber+"恭喜！！！");
                break;
            }
        }

    }
}
