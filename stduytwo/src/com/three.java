package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/22 8:33
 */
public class three {
    public static void main(String[] args){
           int result=sum(10, 20);
           System.out.println(result);

            double result1=sum(20.0, 10.2);
           System.out.println(result1);

          int result2=sum(10, 20, 30);
           System.out.println(result2);
    }
    public static int sum(int a,int b){
           return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
}
