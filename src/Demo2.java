public class Demo2 {
    public static void main(String[] args) {
        //ab main isme runnable interface ka object banaunga
      //  MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(() -> System.out.println("Thread is running"));

        t1.start();
    }
}
//Thread using runnable interface
//koi bhi cheez jo run ho sakti hai, usse is interface ko run karna hi padea runnable interface ko..

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");

    }
}