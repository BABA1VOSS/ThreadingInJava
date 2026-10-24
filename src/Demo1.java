public class Demo1 {
    public static void main(String[] args) {
        //Threads
        MyThread t1 = new MyThread();
        t1.start();
    }
}


//Extension of Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
/*
t1.start() --> JVM asks OS to create new thread ---> when thread creates it has own stack program counter space   ..........thread execute run method
 */