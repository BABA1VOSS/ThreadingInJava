package METHODS;

public class Tester {
    public static void main(String[] args) {
        Counter counter = new Counter();
        InitThread t1 = new InitThread(counter);
        InitThread t2 = new InitThread(counter);
        t1.start();
        t2.start();
        //2 thread hai or common resource hai common counter hai , dono main ek hi object share kar rakha hai mene
        try{// bina try catch ke dono ek hi kisi instance ko pakad ke print hote rehte!
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
