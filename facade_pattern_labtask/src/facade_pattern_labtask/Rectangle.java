/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade_pattern_labtask;

/**
 *
 * @author Muneer Hasan
 */
public class Rectangle implements Shape{
       @Override
   public void draw(StringBuilder sb, String... args) {
   sb.append("Rectangle::draw()").append(String.join("", args)).append("\n");
   }
}
