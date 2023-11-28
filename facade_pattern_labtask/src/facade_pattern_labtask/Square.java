/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade_pattern_labtask;

/**
 *
 * @author Muneer Hasan
 */
public class Square implements Shape{
      @Override
   public void draw(StringBuilder sb, String... args) {
      System.out.println("Square::draw()");
      sb.append("Square: ").append(String.join(", ", args)).append("\n");
   }
}
