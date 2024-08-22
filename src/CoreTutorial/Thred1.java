package CoreTutorial;

public class Thred1 implements Runnable {
    String s="hello";

    Chat chat;
    String[] str={"Hi","How are You!!","I am also fine!!"};

    public Thred1(Chat m){
        this.chat=m;
      Thread t=new Thread(this,"Question");
      t.start();
    }
    @Override
    public void run() {
        for(int i=0;i<str.length;i++){
            chat.Question(str[i]);
        }
    }
}
