package com.harsh;

public class Student {
    String name;
    int marks;
    String subject;

    public Student(String name, int marks, String subject){
        this.name=name;
        this.marks=marks;
        this.subject=subject;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public String getSubject(){
        return subject;
    }
    @Override
    public String toString(){
        return name+" | "+subject+" | "+marks;
    }
}
