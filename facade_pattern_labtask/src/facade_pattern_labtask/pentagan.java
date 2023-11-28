/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade_pattern_labtask;

/**
 *
 * @author Muneer Hasan
 */
public class pentagan implements Shape{

    @Override
    public void draw(StringBuilder sb, String... args) {
        System.out.println("Pentagan::draw()");
      sb.append("Pentagan: ").append(String.join(", ", args)).append("\n");
    }
    
}
