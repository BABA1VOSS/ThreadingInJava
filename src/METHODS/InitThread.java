package METHODS;

public class InitThread extends Thread{
    private Counter counter;

    public InitThread(Counter counter) {
        this.counter = counter;
    }
        @Override
        public void run() {
        for (int i = 0; i < 1000; i++ ){
            counter.increment();
        }
    }
}
