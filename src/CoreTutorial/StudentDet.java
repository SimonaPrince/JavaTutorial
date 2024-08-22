package CoreTutorial;

public class StudentDet {
    String name;
    String rollNo;

    String department;

    public StudentDet(String nm, String rn, String department){
        this.name=nm;
        this.rollNo=rn;
        this.department=department;
    }

    public String getName(){
        return name;
    }
    public String getRollNo(){
        return  rollNo;
    }
    public String getDepartment(){
        return department;
    }
}
