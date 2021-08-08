package com;

import java.util.Scanner;

/**
 * 功能描述 TODO
 *
 * @author nianxi on 2021/7/26 16:57
 */
public class StudentManager {
    public static void main(String[] args) {
        while (true) {
            System.out.println("--------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 添加学生");
            System.out.println("3 添加学生");
            System.out.println("4 添加学生");
            System.out.println("5 添加学生");
            System.out.println("请输入你的选择");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    return;
            }
        }
    }
}

