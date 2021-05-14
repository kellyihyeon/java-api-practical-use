package com.lecture.javaproject;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

public class Project01_C {

    public static void main(String[] args) {

        String src = "info.json";
        //IO -> Stream
        InputStream inputStream = Project01_C.class.getResourceAsStream(src);

        if (inputStream == null) {
            throw new NullPointerException("Cannot find resource file.");
        }
        JSONTokener tokener = new JSONTokener(inputStream);
        JSONObject object = new JSONObject(tokener);
        JSONArray students = object.getJSONArray("students");
        for (int i = 0; i < students.length(); i++) {
            JSONObject student = (JSONObject) students.get(i);
            System.out.println("student.get(\"name\") = " + student.get("name"));
            System.out.println("student.get(\"address\") = " + student.get("address"));
            System.out.println("student.get(\"phone\") = " + student.get("phone"));
        }


    }
}
