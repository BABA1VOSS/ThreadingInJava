//Thread Lifecyle

public class Demo6 {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
//humari na thread class ke under na ek enum hota hai jisko hum State bolte hai isme sari State hoti hai , bas ek running stage ni hogi kyunki wo runnable main ke under hi ajayegi
//        Thread new Stage
        Thread t1 = new Thread(() -> {
            System.out.println("Name of current Thread is " + Thread.currentThread().getName());
            System.out.println("Main Thread is " + mainThread.getState());//is state se pata chal ki wo timed waiting hai isko uper isliye likha gya hai kyunki sleep ke bad to wo terminate hi ho jayega na terminate mein state kaise show hoga isliye usko ek mainThread main store karva ke humne uska alag se state pata kar lia ..
        });
        System.out.println(t1.getState());
        //Runnable stage
        t1.start();
        //yeh cheez pehle print hoti hai uper wale t1.getstate se
        //isak best tareela hai jo meri main thread hai na usko main thodi der ke lie sleep karvau usko bolu ki tu ruk jaa
        System.out.println(t1.getState()); // RUNNABLE , rare case -> Teriminated


//        Thread.sleep(2000);---> Thread main ek static method hai sleep jisse ki sleep ho jata hai             humara current thread printout wala after execution or t1.start
        // yeh dalne pe ek error aarha hai jiska naam hai unhandled exception siko main try catch block main likh dunga
        try {
            Thread.sleep(2000);
        }
        catch (Exception e) {} // -> isme humne pehle apni main thread ko 2 sec ke lie sleep kia jisme mereko pata tha meri woh wali thread print ho jayegi sleep kia to woh print hui or Terminated show ho gya
        System.out.println(t1.getState());//rare case -> Teriminated
    }
}
