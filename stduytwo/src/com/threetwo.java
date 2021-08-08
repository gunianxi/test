package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/22 9:04
 */
public class threetwo {
    public static void main(String[] args){
    System.out.println(compare(10, 20));
    System.out.println(compare((byte) 2, (byte) 2));
    System.out.println(compare((short) 1, (short) 2));
    System.out.println(compare((long) 20, (long) 20));
    }
    //int
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a==b;
    }
    //byte
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a==b;
    }
    //short
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a==b;
    }
    //long
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a==b;
    }


}
