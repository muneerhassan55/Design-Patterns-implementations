/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite_dp;

/**
 *
 * @author Muneer Hasan
 */
public abstract class BaseEmployee implements IEmployee{
   private String name;
    private double salary;

    public BaseEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters for name and salary

    @Override
    public void giveBonus(int bonusPercentage) {
        double bonus = (bonusPercentage / 100.0) * salary;
        System.out.println("Bonus of $" + bonus + " given to " + name);
    }

    public String getName() {
        return name;
    }
}
