package DesignPatterns.Builder;

public class Builder {
   int id;
     String name;
    String dept;

    public void setId(int id) {
        this.id = id;
    }

    private Builder(){

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public static Builder getInstance(){
        return new Builder();
    }
    public Student build(){
        return  new Student(this);
    }
    @Override
    public String toString() {
        return "Builder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

}
