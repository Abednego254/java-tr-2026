import java.lang.Boolean;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {
        this.name = "Joe";
        this.contract = true;
        this.salary = 5000;

    }

    public String toString() {
        return "Name: " + name + ", Contract: " + contract + ", Salary: " + salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
//        emp.name = "John";
//        emp.contract = true;
//        emp.salary = 5000;

        System.out.print(emp);
    }
}
