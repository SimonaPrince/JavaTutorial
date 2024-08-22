package CoreTutorial;

public class Thred2 implements Runnable{
    Chat chat;
    String[] str= {"Hi!","I am good,What about you ?","Great!!"};
    public Thred2(Chat m){
        this.chat=m;
        new Thread(this,"Answer").start();
    }

    @Override
    public void run() {
            for(int i=0;i<str.length;i++){
                chat.Answer(str[i]);
            }
    }
}
