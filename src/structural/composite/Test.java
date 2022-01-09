package structural.composite;

public class Test {
    public static void main(String[] args) {

        Employee d1 = new Developer("Behrooz", 6700);
        Employee d2 = new Developer("Sajjad", 6500);
        Employee m1 = new Manager("Mehdi", 8000);
        m1.add(d1);
        m1.add(d2);

        Manager m2 = new Manager("Ahmad", 8500);
        m2.add(new Developer("isa", 4800));
        m2.add(m1);

        m2.print();
    }
}
