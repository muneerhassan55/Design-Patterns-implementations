/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite_dp;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Muneer Hasan
 */
public class SubordinateIterator implements Iterator<BaseEmployee>{
     private List<BaseEmployee> subordinates;
    private int currentIndex = 0;

    public SubordinateIterator(List<BaseEmployee> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < subordinates.size();
    }

    @Override
    public BaseEmployee next() {
        return subordinates.get(currentIndex++);
    }
}
