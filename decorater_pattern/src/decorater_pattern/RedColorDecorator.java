/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorater_pattern;

/**
 *
 * @author Muneer Hasan
 */
public class RedColorDecorator implements ShapeDecorator {
   private Shape decoratedShape;

    public RedColorDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        decorate();
    }

    @Override
    public void decorate() {
        System.out.println(" with Red color");
    } 
}
