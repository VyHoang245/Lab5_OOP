/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cdstore;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CD implements Serializable{

    private String id;
    private String collection;
    private String type;
    private String title;
    private String price;
    private String year;
    Scanner sc = new Scanner(System.in);

    public CD(String id, String collection, String type, String title, String price, String year) {
        this.id = id;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public CD() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void Input() {
        System.out.print("CD Id: ");
        id = sc.next();
        System.out.print("CD collection: ");
        collection = sc.next();
        System.out.print("CD type: ");
        type = sc.next();
        System.out.print("Title: ");
        title = sc.next();
        System.out.print("Price: ");
        price = sc.next();
        System.out.print("Year of release: ");
        year = sc.next();

    }

    public void Output() {
        System.out.print("-CD Id: " + id + "_");
        System.out.print("CD collection: " + collection + "_");
        System.out.print("CD type: " + type + "_");
        System.out.print("Title: " + title + "_");
        System.out.print("Price: " + price + "_");
        System.out.println("Year of release: " + year);
    }
}