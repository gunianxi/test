package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/23 21:06
 */
public class four {
    public static void main(String[] args){
        int[] arr={10,20,30};
        System.out.println("前："+arr[1]);
        change(arr);
        System.out.println("后："+arr[1]);
    }
    public static void change(int[] arr){
        arr[1]=200;
    }
}
