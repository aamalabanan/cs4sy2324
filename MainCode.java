/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author CS4CHarmMalabanan
 */
public class MainCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Song a= new Song("Bite Me");
        Singer b = new Singer("Enhypen");
        Song c = new Song ("Blue Hour");
        Singer d = new Singer("TXT");
        b.performForAudience(10, d);
        
        // TODO code application logic here
    }
    
}
