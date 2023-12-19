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
public class Director extends BaseEmployee{
  private List<BaseEmployee> subordinates = new ArrayList<>();

    public Director(String name, double salary) {
        super(name, salary);
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

