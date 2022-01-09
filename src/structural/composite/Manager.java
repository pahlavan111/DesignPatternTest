package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee{

    String name;
    double salary;
    List<Employee> employees = new ArrayList<>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee emp) {
        employees.add(emp);
    }

    @Override
    public void remove(Employee emp) {
        employees.remove(emp);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Manager name is: "+ name);
        System.out.println("Salary is: "+ salary);
        System.out.println("- - - - - - - - - - - - - - - - - -");

        Iterator<Employee> empIterator = employees.iterator();
        while (empIterator.hasNext()){
            Employee employee = empIterator.next();
            employee.print();
        }
    }
}
