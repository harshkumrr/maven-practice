package com.harsh;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args ) {
        Gson gson = new Gson();
        Student student = new Student("Harsh",98,"Java");
        String json = gson.toJson(student);
        System.out.println("JSON: "+json);

        Student s2 = gson.fromJson(json, Student.class);
        System.out.println("name: "+s2.getName());
        System.out.println("marks: "+s2.getMarks());
    }
}
