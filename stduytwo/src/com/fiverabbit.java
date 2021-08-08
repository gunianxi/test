package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/24 9:59
 */
public class fiverabbit {
    public static void main(String[] args){
        int[] arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for(int i=0;i<18;i++){
            arr[i+2]=arr[i]+arr[i+1];
        }
        System.out.println(arr[19]);
    }
}
