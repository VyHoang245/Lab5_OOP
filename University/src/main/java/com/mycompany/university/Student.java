/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vygir
 */
public abstract class Student implements Serializable{
    private String studentNumber;
    private String name;
    private int totalCredit;
    private double averageScore;

    public Student(String studentNumber, String name, int totalCredit, double averageScore) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.totalCredit = totalCredit;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Student number: ");
        studentNumber = sc.next();
        sc.nextLine();
        System.out.print("Student's full name: ");
        name = sc.nextLine();
        sc.nextLine();
        System.out.print("Total number of credit earned: ");
        totalCredit = sc.nextInt();
        System.out.print("Average score: ");
        averageScore = sc.nextDouble();
    }
    public void getInfo(){
        System.out.print("Student number: "+studentNumber+" _ ");
        System.out.print("Student's full name: "+name+" _ ");
        System.out.print("Total number of credit earned: "+totalCredit+" _ ");
        System.out.print("Average score: "+averageScore+" _ ");
    }
    public abstract boolean Graduation();
    public abstract int StudentType();
    
}
