package com;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/21 10:56
 */
public class two {
/**  public static void main(String[] args){
               isEvenNumber();

    }
    public static void  isEvenNumber(){
        int number=10;

        if (number%2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
 */
/**   public static void main(String [] args){
        getMax();
    }
    public  static void getMax(){
        int a=10;
        int b=20;

        if (a>b){
            System.out.println("最大数是："+a);
        }else {
            System.out.println("最大数是："+b);
        }
    }
 */
  /** public static void main(String[] args){
        getMax(10, 20);
   }

    public static void getMax(int a,int b){
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    } */
/** public static void main(String[] args){
        // ab(31);
        boolean flag=ab(31);
        System.out.println(flag);
    }
    public static boolean ab(int number){
        if(number%2==0) {
            return true;
        }else {
            return false;
        }
    }*/
    public static void main(String[] args){
        int max=getMax(20, 30);
        System.out.println(max);
    }
    public static int getMax(int a,int b){
        if(a>b) return a;
        else return b;
    }
}
