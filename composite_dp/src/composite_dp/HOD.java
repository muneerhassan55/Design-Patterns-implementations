/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite_dp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muneer Hasan
 */
public class HOD extends BaseEmployee{
    private List<BaseEmployee> subordinates = new ArrayList<>();
    private String departmentName;

    public HOD(String name, double salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
    }

    public void addSubordinate(BaseEmployee subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(BaseEmployee subordinate) {
        subordinates.remove(subordinate);
    }

    public List<BaseEmployee> getSubordinates() {
        return subordinates;
    }
}
