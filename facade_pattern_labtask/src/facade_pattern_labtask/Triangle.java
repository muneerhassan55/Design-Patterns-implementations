/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade_pattern_labtask;

/**
 *
 * @author Muneer Hasan
 */
public class Triangle implements Shape{

    @Override
    public void draw(StringBuilder sb, String... args) {
        System.out.println("Triangle::draw()");
      sb.append("Trangle: ").append(String.join(", ", args)).append("\n");
    }
    

}
