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
public class UniversityStudent extends Student {

    private String thesisName;
    private double thesisScore;

    public UniversityStudent() {
    }

    public UniversityStudent(String thesisName, double thesisScore, String studentNumber, String name, int totalCredit, double averageScore) {
        super(studentNumber, name, totalCredit, averageScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudent(String thesisName, double thesisScore) {
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Thesis name: ");
        thesisName = sc.next();
        System.out.print("Thesis score: ");
        thesisScore = sc.nextDouble();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("University Student");
    }

    @Override
    public boolean Graduation() {
        if (getTotalCredit() >= 150 && getAverageScore() >= 5 && thesisScore
                >= 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getAverageScore() {
        return super.getAverageScore();
    }

    @Override
    public int getTotalCredit() {
        return super.getTotalCredit();
    }

    @Override
    public int StudentType() {
        return 1;
    }

}
