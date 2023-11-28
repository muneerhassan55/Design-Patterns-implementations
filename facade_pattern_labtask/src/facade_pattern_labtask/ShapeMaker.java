/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade_pattern_labtask;

/**
 *
 * @author Muneer Hasan
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }


  
   public void drawSahpe(StringBuilder sb, String shapeType, String... args) {
      switch (shapeType.toLowerCase()) {
         case "circle":
            circle.draw(sb, args);
            break;
         case "rectangle":
            rectangle.draw(sb, args);
            break;
         case "square":
            square.draw(sb, args);
            break;
         default:
            sb.append("Invalid shape type: ").append(shapeType).append("\n");
      }
   }
}
