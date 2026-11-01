package METHODS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;


    private final Lock lock = new ReentrantLock();//RenterantLock ek class hai jo ki implement kar rahi hai Lock interface ko !   or to or yeh synchronized keyword ko access karta hai
    //isme final dalne se yeh ho gya hai ki ab koi isko change nahi kar sakta hai !

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to Withdraw " + amount );
       //   if (lock.tryLock()){  //yeh cheez yeh dikhati hai ki example le ke samjhe ki abhi server free hai to ap wait mat karo bad main aake try krna

        try {
//            lock.lock();// second type of synchronization
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){//itne time ke lie wait karega agar itne time main lock free mil jayega lekin agar nahi mila isko free to wo wait karega jo time de rkha hai lekin uske bad bhi free ni hua to false return kar dega
                if (balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with Withdrawl ");
                        Thread.sleep(3000); //simulate time taken to process the withdraw.
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawl. Remaining balance : " + balance);
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();//hamesha unlock ko finally hi rehne dena hai or finally keyword ke under hi wrote karna hai because in finally , we relase the resources at end.
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + "insufficient balance " );
                }

            }else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try again later ");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();//this is a good practice we have to do this it will manually restore the state of that thread. after this we can do then maintenance and cleaning of code
        }
    }
}






    //synchronized keyword ka use kia hai ab jab tak t1 pura isko complete nahi krega including sleep method tab tak t2 isko execute nahi kar sakta.
//    public synchronized void withdraw(int amount) {
//    public synchronized void withdraw(int amount) {
//        System.out.println(Thread.currentThread().getName() + " attempting  to Withdraw " + amount);
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName() + "processing with Withdrawl");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " completed Withdrawl.Remaining balance: " + balance);
//        }
//        else {
//            System.out.println(Thread.currentThread().getName() + "insufficient balance");
//        }

//    }
//}
