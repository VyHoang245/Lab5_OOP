/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

import java.util.Scanner;

/**
 *
 * @author vygir
 */
public class CollegeStudent extends Student {

    private double graduationScore;

    @Override
    public double getAverageScore() {
        return super.getAverageScore();
    }

    @Override
    public int getTotalCredit() {
        return super.getTotalCredit();
    }

    public CollegeStudent() {
    }

    public CollegeStudent(double graduationScore, String studentNumber, String name, int totalCredit, double averageScore) {
        super(studentNumber, name, totalCredit, averageScore);
        this.graduationScore = graduationScore;
    }

    public CollegeStudent(double graduationScore) {
        this.graduationScore = graduationScore;
    }

    public double getGraduationScore() {
        return graduationScore;
    }

    public void setGraduationScore(double graduationScore) {
        this.graduationScore = graduationScore;
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Graduation exam score: ");
        graduationScore = sc.nextDouble();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("College Student");
    }

    @Override
    public boolean Graduation() {
        if (getTotalCredit() >= 100 && getAverageScore() >= 5 && graduationScore >= 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int StudentType() {
        return 0;

    }

}
