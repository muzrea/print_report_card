package main.controller;

import java.util.Scanner;

public class ApplicationController {
    public static void processInput(String input){
        switch (input){
            case "1":
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...），按回车提交：");
                String student = sc.nextLine();
                StudentManager.processAddStudent(student);
                break;
            case "2":
                Scanner sc2 = new Scanner(System.in);
                System.out.println("请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交：");
                String studentNo = sc2.nextLine();
                StudentManager.printReport(studentNo);
                break;
            case "3":
                break;
            default:
                break;
        }
    }

}
