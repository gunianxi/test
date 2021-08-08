package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/23 21:21
 */
public class bianli {
    public static void main(String[] args){
        /**   System.out.println("hello");
        System.out.println("world");
        System.out.print("hello");
        System.out.print("world");
        System.out.println();
         */
        int[] arr={11,22,33,44,55};
        ab(arr);
    }

    public static void ab(int[] arr){
        System.out.print("[");
        for (int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.print(arr[x]);
            }
            else{
                System.out.print(arr[x]+",");
            }
        }
          System.out.print("]");
    }

}
