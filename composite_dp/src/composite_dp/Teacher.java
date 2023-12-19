/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite_dp;

/**
 *
 * @author Muneer Hasan
 */
public class Teacher extends BaseEmployee{
    
  private String qualification;
    private String status;

    public Teacher(String name, double salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }
    
}
