package coms.ThreadCreation;

public class DaemonMethod {
    public static void main(String[] args) {
        Runnable run = ()-> {
            {
                while (true){
               try{ Thread.sleep(1000);}catch(Exception e){};
                System.out.println("hello");
            }}
        };
        Thread t1 = new Thread(run);
        t1.setDaemon(true);
        t1.start();
        try{Thread.sleep(3000);}catch(InterruptedException e){};
        System.out.println("hei");

    }
}
