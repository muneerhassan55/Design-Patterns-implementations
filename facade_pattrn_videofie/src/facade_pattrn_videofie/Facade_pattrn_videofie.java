/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade_pattrn_videofie;
import java.io.File;
/**
 *
 * @author Muneer Hasan
 */
public class Facade_pattrn_videofie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // TODO code application logic here
    }
    
}
