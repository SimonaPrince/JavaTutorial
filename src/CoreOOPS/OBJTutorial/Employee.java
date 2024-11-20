package CoreOOPS.OBJTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private String id;
    private double sal;

    public Employee(String name, String id, double salary){
        this.name=name;
        this.id=id;
        this.sal=salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public int compareTo(Employee employee) {
        return (int) (this.sal - employee.sal);
     }

     public static void main(String[] args){
         List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Simona","2019WA86050",1500000));
         employeeList.add(new Employee("Prince","2019WA86051",505000));
         Collections.sort(employeeList);
         employeeList.forEach( e -> System.out.println("Employee Name:"+e.getName()+"Employee ID:"+e.getId()+"Employee Salary:"+e.getSal()));

     }
}
