package CoreOOPS.OBJTutorial;

import java.util.Comparator;

public class EmployeeNameCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }

    public static void main(String[] args){

    }
}
