public class Hello {
    public static void main(String[] args) {

        World world  = new World();
            Thread t1 = new Thread(world);//isme iske constructor main world dalna padega jab implements wali kahani hum use kar rhe honge
            t1.start();
        for (; ;) {
//            System.out.println("hello" );
//            System.out.println(Thread.currentThread().getName());
            System.out.println("hello");
        }
    }
}
// -------------IMPLEMENTS RUNNABLE METHOD------------------------
/*
1. A new class World is created that implements Runnable.
2. The run method is overridden to define the code that constitutes the new thread.
3. A Thread object is created by Passing an instance of MyRunnable.
4. Start method is called on the Thread object to initiate the new Thread.
 */


// -------------EXTENDS THREAD METHOD------------------------
/*
1. A new class World is created that extends Thread.
2. The run  method is overriden to define the code that constitutes the new Thread.
3. Start method is called to initiate the new Thread.
 */