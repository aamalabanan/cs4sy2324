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
public class Student {
    public String name;
    public ArrayList<Assignment> assignments;

    public Student(String name){
        this.name = name;
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment a){
        this.assignments.add(a);
    }

    public void finishAssignment(Assignment a){
        this.assignments.remove(a);
    }

    public double getTimeNeeded(){
        double time = 0;
        for(Assignment a: assignments){
            time += a.getTimeAllotted();
        }
        return time;
    }

    public String getName(){
        return this.name;
    }
}
