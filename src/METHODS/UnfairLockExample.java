//package METHODS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//public static class UnfairLockExample  {
//
//
//
//    private final Lock unfairLock = new ReentrantLock();
//
//
//    public void accessResource() {
//        unfairLock.lock();
//        try {
//            System.out.println(Thread.currentThread().getName() + " acquired the lock");
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            Thread.currentThread().interrupt();
//        }finally{
//            unfairLock.unlock();
//            System.out.println(Thread.currentThread().getName() + " released the lock  ");
//        }
//    }
//}

    // # CODE FOR FAIR LOCK EXAMPLE
//public static void FairnessLockExample {
//    private final Lock lock = new ReentrantLock(true);
//    public void accessResource
//
//            }
//little changes to do above in method colunms



    public static void main(String[] args) {
//        UnfairLockExample example = new UnfairLockExample();
//
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                example.accessResource();
//            }
//        };
//
//
//        Thread thread1 = new Thread(task, "Thread 1");
//        Thread thread2 = new Thread(task, "Thread 2");
//        Thread thread3 = new Thread(task, "Thread 3");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

        // try{//is method se orderm chlta hai par yeh method jyda threads main applicable nahi hota sare ke sare race condition karne lag jate hai  ab koi thread reh gya usko time mil hi ni rha hai baki sare thread to chal rhe hai lekin wo ni chal pa rha hai to  ussi cheez ko kehte hai Starvation method ..
//            thread1.start();
//            Thread.sleep(50);
//             thread2.start();
//            Thread.sleep(50);
//            thread3.start();
//            Thread.sleep(50);
//        }
//        catch (Exception e){
//
//                }
        //we see that the thread is running in arbritary manner which means threads execute in an unpredictable order, depending on the thread scheduler.

    }
    /* synchronization ke disadvantages
    true  faireness
    bocking
    interruptibility
    Read/write Locking




     */