/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite_dp;

/**
 *
 * @author Muneer Hasan
 */
public class EmployeeController {
     private Director director;

    public EmployeeController(Director director) {
        this.director = director;
    }

    public void generateOrganogram() {
        // Logic to generate and display the organizational structure
    }

    public void activateBonus(String bonusType, int percentageOfBonus) {
        for (IEmployee subordinate : director.getSubordinates()) {
            subordinate.giveBonus(percentageOfBonus);
        }
    }
}
