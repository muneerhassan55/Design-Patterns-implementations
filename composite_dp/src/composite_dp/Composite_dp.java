/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite_dp;

/**
 *
 * @author Muneer Hasan
 */
public class Composite_dp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Creating instances of employees
        Teacher teacher1 = new Teacher("John Doe", 50000, "Ph.D.", "Full-time");
        DOO doo1 = new DOO("Jane Smith", 60000, "Senior");
        HOD hod1 = new HOD("Dr. Johnson", 80000, "Computer Science");

        // Creating a director
        Director director = new Director("Prof. Director", 100000);

        // Adding employees to the director's subordinates
        director.addSubordinate(teacher1);
        director.addSubordinate(doo1);
        director.addSubordinate(hod1);

        // Creating an EmployeeController
        EmployeeController controller = new EmployeeController(director);

        // Generating and displaying the organogram
        controller.generateOrganogram();

        // Activating a bonus for all employees
        controller.activateBonus("Year-End Bonus", 10);

        // Using the Iterator pattern to traverse subordinates
        System.out.println("\nTraversing subordinates using Iterator:");
        SubordinateIterator iterator = new SubordinateIterator(director.getSubordinates());
        while (iterator.hasNext()) {
            BaseEmployee subordinate = iterator.next();
            System.out.println(subordinate.getClass().getSimpleName() + ": " + subordinate.getName());
        }

        // Using the Observer pattern for notification
        System.out.println("\nNotifying observers of a change:");
        UniversitySubject universitySubject = new UniversitySubject();
        EmployeeObserver observer1 = new EmployeeObserver("Observer 1");
        EmployeeObserver observer2 = new EmployeeObserver("Observer 2");

        universitySubject.addObserver(observer1);
        universitySubject.addObserver(observer2);

        // Notifying observers
        universitySubject.notifyObservers();	
   }
        // TODO code application logic here
    
    
}
