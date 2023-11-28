/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade_pattern_labtask;

/**
 *
 * @author Muneer Hasan
 */
public class Facade_pattern_labtask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ShapeMaker shapeMaker = new ShapeMaker();
      StringBuilder sb = new StringBuilder();

      shapeMaker.drawSahpe(sb, "circle", "red", "border");
      shapeMaker.drawSahpe(sb, "rectangle", "green", "filled");
      shapeMaker.drawSahpe(sb, "square", "blue", "dotted");
      shapeMaker.drawSahpe(sb, "triangle", "yellow", "solid");
      shapeMaker.drawSahpe(sb, "Pentagan", "Black", "solid");
      System.out.println(sb.toString());
        // TODO code application logic here
    }
    
}
