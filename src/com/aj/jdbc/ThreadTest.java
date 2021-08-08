package com.aj.jdbc;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/15 21:25
 */

    class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        System.out.println("hello");
        MyThread t2 = new MyThread();
        t2.start();
    }

}
