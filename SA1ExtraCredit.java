/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sa1.extra.credit;

/**
 *
 * @author amuel
 */
public class SA1ExtraCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Teacher t1 = new Teacher("Mr. Smith", "Math");
    Teacher t2 = new Teacher("Mrs. Johnson", "Science");
    Teacher t3 = new Teacher("Dr. Brown", "History");

    Section c1 = new Section("Section 1");
    Section c2 = new Section("Section 2");

    Student s1 = new Student("Alice");
    Student s2 = new Student("Bob");
    Student s3 = new Student("Charlie");

    c1.addStudent(s1);
    c1.addStudent(s2);
    c2.addStudent(s3);

    t1.addSection(c1);
    t1.addSection(c2);
    t2.addSection(c2);
    t3.addSection(c1);

    Assignment a1 = new Assignment("Homework 1", 2);
    Assignment a2 = new Assignment("Lab 1", 3);
    Assignment a3 = new Assignment("Test 1", 5);

    t1.giveAssignment(a1);
    t2.giveAssignment(a2);
    t3.giveAssignment(a3);

    s2.finishAssignment(a1);

    System.out.printf("%s remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
    System.out.printf("%s remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
    System.out.printf("%s remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
}
    
}
