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
public class Teacher {
    public String name;
    public String subject;
    public ArrayList<Section> sections;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
        this.sections = new ArrayList<>();
    }

    public void giveAssignment(Assignment a){
        for(Section s: sections){
            for(Student st: s.getStudents()){
                st.addAssignment(a);
            }
        }
    }

    void addSection(Section c1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
