package com.lecture.javaproject;

import org.json.JSONArray;
import org.json.JSONObject;

public class Project01_B {

    public static void main(String[] args) {
        //JSON - Java(org.json)
        JSONArray students = new JSONArray();

        JSONObject student = new JSONObject();
        student.put("name", "Marcelline");
        student.put("phone", "010-1111-1111");
        student.put("address", "Seoul");
        System.out.println("student = " + student);
        //student = {"address":"Seoul","phone":"010-1111-1111","name":"Marcelline"}

        students.put(student);

        student = new JSONObject();
        student.put("name", "Bubblegum");
        student.put("phone", "010-1112-1112");
        student.put("address", "CandyKingdom");
        System.out.println("student = " + student);

        students.put(student);

        JSONObject object = new JSONObject();
        object.put("students", students);
        System.out.println("object = " + object.toString(2));




    }
}
