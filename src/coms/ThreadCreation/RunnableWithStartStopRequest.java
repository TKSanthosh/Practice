package coms.ThreadCreation;
class stopRun implements Runnable {
    private static boolean thisrequest = false;

    public static void changerRequest() {
       thisrequest = true;
    }

    public void changerequest(){
        this.thisrequest= true;
    }
    private boolean thisRequestMethod(){
         return thisrequest;
    }
    public void run() {
        System.out.println("Runnable started");
        while (!thisrequest){
            try{Thread.sleep(1000);}catch(InterruptedException e){};
            System.out.println("...");
        }
        System.out.println("runnable stopped");
    }
}
public class RunnableWithStartStopRequest {
    public static void main(String[] args) {
        Runnable run = new stopRun();
        Thread t1 = new Thread(run,"the thread");
        t1.start();

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {};
        System.out.println("changing the request");
        stopRun.changerRequest();
        System.out.println("totally stopped");
    }
}
