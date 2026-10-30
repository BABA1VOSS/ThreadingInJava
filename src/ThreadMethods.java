public class ThreadMethods  extends Thread  {
    @Override
    public void run() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        for (int i = 1; i <= 5; i++){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//            System.out.println(i);
//    }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 =new ThreadMethods();
        t1.start();
        t1.join();
        System.out.println("hello");
    }
}
//Start
//run
//sleep
//join


