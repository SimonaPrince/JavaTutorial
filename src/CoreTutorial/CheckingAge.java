package CoreTutorial;

public class CheckingAge{
    private int age;
  public CheckingAge(int age){
      this.age=age;
  }
   public void CheckAge() throws AgeLimitException{
       if((age <5 ) || (age> 30)){
           throw new AgeLimitException(age);
       }
        else{
            System.out.println(age);
       }
   }

}
