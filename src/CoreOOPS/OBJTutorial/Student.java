package CoreOOPS.OBJTutorial;

public class Student {
    private String Name;
    private String roll;
    private int Rank;

    public String getName() {
        return Name;
    }

    public String getRoll() {
        return roll;
    }

    public int getRank() {
        return Rank;
    }

    public Student(String name, String roll, int rank) {
        Name = name;
        this.roll = roll;
        Rank = rank;
    }
}
