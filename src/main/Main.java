package main;

import main.controller.ApplicationController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.添加学生");
        System.out.println("2.生成成绩单");
        System.out.println("3.退出");
        System.out.println("请输入你的选择（1-3） ： ");
        String input = sc.nextLine();
        ApplicationController.processInput(input);
    }

}
