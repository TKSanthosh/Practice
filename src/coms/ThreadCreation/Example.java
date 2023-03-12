package coms.ThreadCreation;

public class Example {
    public static void main(String[] args) throws Exception {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t.setName("good morning");

        t.start();
        t.join();

        Thread t1 = new Thread(()->
                {
System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 5;i++) {
                System.out.println("hi");
            }
        },"hello");
        t1.start();

        t1.join();
        System.out.println("bye");

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t2 = new Thread(run,"good evening");
        t2.start();
    }
}
