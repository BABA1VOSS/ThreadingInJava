public class World implements Runnable {// 1st method
//public class World extends Thread { 2nd method
    @Override
    public void run() {
        for (; ; ){
            System.out.println("world");
        }
    }
}

