package METHODS;
//In a multiple thread Envoironment, threads often need to communicate and coordinate  with each other to accomplish to a task ...
//some methods to introduced for inter Thread communication are
//wait
//notify
//notifyAll
//------these methods only be called as a synchronized method
//what is the problem of Thread with out communication?
//Answer - > Without proper thread communication , checking of Thread conditions countinously  by which it wastes the CPU ( Engagement of CPU for a work)


class SharedResource {
    private int data;
    private boolean hasData;



    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();//interrupt wali cheez isliye dali taki woh apne original state main wapis ajaye
            }
        }
        data = value;
        System.out.println("Produced: " + value);
        hasData = true;
        notifyAll();

    }

    public synchronized int Consume(int value) {
        while (!hasData){
            try {
                wait();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}
class Producer implements Runnable {

    private SharedResource resource;


    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable {

    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }
    @Override
    public void run(){
        for (int i =0; i < 10; i++) {
            int value = resource.Consume(i);
        }
    }

}



public class MasteringThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread ProducerThread = new Thread(new Producer(resource));
        Thread ConsumerThread = new Thread(new Consumer(resource));

        ProducerThread.start();
        ConsumerThread.start();
    }
}
