package main.controller;

import main.model.Student;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentManager {
    public static void processAddStudent(String student) {
        String reg = "[\\u0391-\\uFFE5]+,[0-9]+,([\\u0391-\\uFFE5]+:[0-9]+,)*([\\u0391-\\uFFE5]+:[0-9]+)";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(student);
        String[] studentInfo = student.split(",");
        if (matcher.matches()) {
            addStudent(studentInfo);
            System.out.println("学生" + studentInfo[0] + "的成绩被添加");
        } else {
            System.out.println("请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）：");
        }
    }

    public static void addStudent(String[] studentInfo) {
        List<String> infoList = Arrays.asList(studentInfo);
        String name = infoList.get(0);
        String id = infoList.get(1);
        Map<String, Double> scores = getScoreMap(infoList);
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(name, id, scores));
    }

    public static Map<String, Double> getScoreMap(List<String> infoList) {
        Map<String, Double> scores = new HashMap<>();
        infoList.stream().skip(2).map(s -> s.split("：")).forEach(arr -> scores.put(arr[0], Double.parseDouble(arr[1])));
        return scores;
    }

    public static void getReport(String[] studentIds) {

    }
}
