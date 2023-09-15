 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CS4CharmMalabanan
 */
public class Song {
    private String title, albumname;
    private int timesPlayed;
    
    public Song(String title){
        this.title = "Fever";
        this.albumname = "Dimension";
        this.timesPlayed = 4;
    }
    
    public String getTitle(){
        return title;
}
    public void setTitle(String title){
        this.title = title;
        
    }

    /**
     * @return the albumname
     */
    public String getAlbumname() {
        return albumname;
    }

    /**
     * @return the timesPlayed
     */
    public int getTimesPlayed() {
        return timesPlayed;
    }

}
