package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/26 15:43
 */
public class six {
    public static void main(String[] args){
        for(int x=0;x<=20;x++){
            for(int y=0;y<=33;y++){
               int z=100-x-y;
               if(z%3==0 && 5*x+3*y+z/3==100){
                   System.out.println(x+","+y+","+z);

               }
            }
        }
        StringBuilder sb=new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb.length:"+sb.length());

        StringBuilder sb2=new StringBuilder("hello");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length:"+sb2.length());
    }
}
