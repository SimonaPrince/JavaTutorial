package DesignPatterns.Builder;

final class Student {
    private final int id;
    private final String name;
    private final String dept;

    public Student(Builder builder){
        this.id=builder.id;
        this.name= builder.name;
        this.dept=builder.dept;
    }
}
