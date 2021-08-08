package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/23 21:32
 */
public class shuzumax {
    public static void main(String[] args){
        int[] arr={12,34,23,64,45};
        max(arr);
    }
    public static void max(int[] arr){
         int c=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    c=arr[i];
                }else {
                    c=arr[j];
                }
            }
        }
        System.out.println(c);
    }
}
