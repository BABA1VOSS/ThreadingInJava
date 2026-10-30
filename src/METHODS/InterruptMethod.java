package METHODS;

public class InterruptMethod extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted:" + e);
        }
    }

    public static void main(String[] args) {
        InterruptMethod t1 = new InterruptMethod();
        t1.start();
        t1.interrupt();

    }
}
