/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amuel
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favorteSong;
    private static int totalPerformances = 0;
    
    public Singer(String name){
        this.name = "Enhypen";
        this.noOfPerformances = 2;
        this.earnings = 100;
        this.favorteSong = "Fever";
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the noOfPerformances
     */
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    /**
     * @return the earnings
     */
    public double getEarnings() {
        return earnings;
    }

    /**
     * @return the favorteSong
     */
    public Song getFavorteSong() {
        return favorteSong;
    }

    /**
     * @param favorteSong the favorteSong to set
     */
    public void changeFavSong(Song favorteSong) {
        this.favorteSong = favorteSong;
    }

    /**
     * @return the totalPerformances
     */
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    
    public void performForAudience(int people){
        this.earnings += 100 * people;
        this.noOfPerformances++;
        totalPerformances++;
        
    }
    public void performForAudience(int people, Singer collab){
        
        double revenue = people * 100;this.earnings += revenue/2;
        collab.earnings += revenue/2;
        this.noOfPerformances++;
        collab.noOfPerformances++;
        totalPerformances++;
    }
}
