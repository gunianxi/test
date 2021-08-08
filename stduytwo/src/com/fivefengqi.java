package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/24 9:42
 */
public class fivefengqi {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%10==7 || i/10%10==7 || i%7==0){
                System.out.println(i);
            }
        }
    }
}
