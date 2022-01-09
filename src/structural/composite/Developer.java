package structural.composite;

public class Developer implements Employee{

    String name;
    double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee emp) {
        // this is leaf node so this method is not applicable in this class
    }

    @Override
    public void remove(Employee emp) {
        // this is leaf node so this method is not applicable in this class
    }

    @Override
    public Employee getChild(int i) {
        // this is leaf node so this method is not applicable in this class
        return null;
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
        System.out.println("Developer name is: "+ name);
        System.out.println("Salary is: "+ salary);
        System.out.println("-----------------------------");
    }
}
