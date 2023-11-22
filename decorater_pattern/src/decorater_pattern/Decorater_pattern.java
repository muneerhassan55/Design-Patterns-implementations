/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorater_pattern;

/**
 *
 * @author Muneer Hasan
 */
public class Decorater_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Shape circle = new Circle();
        System.out.println("Original Circle:");
        circle.draw();

        // Circle with Red color
        Shape redCircle = new RedColorDecorator(new Circle());
        System.out.println("\nCircle with Red color:");
        redCircle.draw();

        // Circle with Thick Border
        Shape thickBorderCircle = new ThickBorderDecorator(new Circle());
        System.out.println("\nCircle with Thick Border:");
        thickBorderCircle.draw();

        // Circle with Red color and Thick Border
        Shape redAndThickBorderCircle = new RedColorDecorator(new ThickBorderDecorator(new Circle()));
        System.out.println("\nCircle with Red color and Thick Border:");
        redAndThickBorderCircle.draw();
        // TODO code application logic here
    }
    
}
