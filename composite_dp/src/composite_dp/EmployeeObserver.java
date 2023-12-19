/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite_dp;

/**
 *
 * @author Muneer Hasan
 */
public class EmployeeObserver implements Observer{
     private String name;

    public EmployeeObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " has been notified of a change in the University.");
    }
}
