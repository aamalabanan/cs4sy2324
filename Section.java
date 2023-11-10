/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa1.extra.credit;

import java.util.ArrayList;

/**
 *
 * @author amuel
 */
public class Section {
    public String name;
    public ArrayList<Student> students;

    public Section(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }
}
