/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twelfthanswer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Padmini Duggirala
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Answer to Question12: Padmini Duggirala");
        // TODO code application logic here
        ArrayList<Employee> eList = new ArrayList<>();
        Employee m1 = new Employee(121, "Aneela Ankam", 5000);
        Employee m2 = new Employee(482, "Kiran Chittipalli", 5500);
        Employee m3 = new Employee(568, "Praneeth Namala", 9000);
        Employee m4 = new Employee(999, "Aruna Ganamani", 7500);
        Employee m5 = new Employee(101, "Srinu Kuchipudi", 4589);
        eList.add(m1);
        eList.add(m2);
        eList.add(m3);
        eList.add(m4);
        eList.add(m5);
        System.out.println("Employees of cognizant: " + "\n" + "Before sorting:");
        print(eList);
        Collections.sort(eList);
        System.out.println("Sorting by Employee Id: ");
        print(eList);

        System.out.println("Sorting by Employee name: ");
        Collections.sort(eList, new Comparator<Employee>() {
            public int compare(Employee m1, Employee m2) {
                return m1.getEmpName().compareTo(m2.getEmpName());
            }
        });
        print(eList);
        System.out.println("Sorting by Employee salary: ");
        Collections.sort(eList, new Comparator<Employee>() {
            public int compare(Employee m1, Employee m2) {
                return Double.compare(m1.getEmpSalary(), m2.getEmpSalary());
            }

        });
        print(eList);
    }

    public static void print(List<Employee> l) {
        l.forEach(employee -> {
            System.out.println(employee);
        });

    }
}