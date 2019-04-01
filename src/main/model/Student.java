package main.model;

import java.util.Map;

public class Student {
    private String name;
    private String id;
    private Map<String,Double> scores;
    private double averageGrade;
    private double totalGrade;
    public Student(String name,String id,Map<String,Double> scores){
        this.name = name;
        this.id = id;
        this.scores = scores;
        /*this.averageGrade =averageGrade;
        this.totalGrade = totalGrade;*/
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Double> getScores() {
        return this.scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }
    public double getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(double AverageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getTotalGrade() {
        return this.totalGrade;
    }

    public void setTotalGrade(double totalGrade) {
        this.totalGrade = totalGrade;
    }
}
