/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4charmmalabanan;

/**
 *
 * @author amuel
 */
public class CS4CharmMalabanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kidol = "Korean Idol";
        String name = "Name: ";
        String age = "age: ";
        String height = "height: ";
        
        
        // korean idol one
        System.out.println(kidol + "1");
        String hee = "Heeseung";
        int heeage = 21; 
        int heeheight = 183; 
        System.out.println(name + hee);
        System.out.println(age + heeage);
        System.out.println(height + heeheight);
        
          System.out.println();
          
        // korean idol two
        System.out.println(kidol + "2");
        String nk = "Niki";
        int nkage = 17;
        int nkheight = 183; 
        System.out.println(name + nk);
        System.out.println(age + nkage);
        System.out.println(height + nkheight);
        
          System.out.println();
          
        // korean idol three
        System.out.println(kidol + "3");
        String jk = "Jake";
        int jkage = 20;
        int jkheight = 175;
        System.out.println(name + jk);
        System.out.println(age + jkage);
        System.out.println(height + jkheight);
        
          System.out.println();
          
          
        nkage -= 0.1;
        jkage += 1;
        boolean nkageislower = nkage < jkage;
        System.out.println("Is Niki younger than Jake?");
        System.out.println("the statement is " + nkageislower + " since Niki is younger than Jake.");
        
        heeheight += 1;
        jkheight -= 0.1;
        boolean heeishigher = heeheight < jkheight;
        System.out.println("Is Jake taller than Heeseung?");
        System.out.println("the statement is " + heeishigher + " since Jake is shorter than Heeseung.");
        
    }
    
}
