package coms.ThreadCreation;
import static java.lang.Thread.sleep;
public class ThreadCreation {
    public static void main(String[] args) {
       new FirstThread();
       Thread t = new FirstThread();
    }
}
class FirstThread extends Thread {
    private static int count = 0;
    private int id;
    public void run() {
        {
            for(int i = 0; i < 10; i++){
                System.out.println("<"+id+">"+"hello");
                try{sleep(1000);}catch(Exception e){}
            }
        }
    }
    public FirstThread(){
        this.id = ++count;
        this.start();
    }
}