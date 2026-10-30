import java.util.Set;

//SetPriority
public class SetPriority extends Thread {
    //jab hum extends kar rahe hai Thead ko to hum iska Thread ka ek alag se naam bhi de sakte hai ..
    //iska Constructor bana sakte hai file name ka bhi or neeche jo variable name pass kia uska bhi jaise file name - SetPriority aagya or wese mene use kia hai MyThread
    //File name ka hi use karna better rahega agar dusra use karte hai to void return type dalna padega fir usko...


    public SetPriority(String name){
        super(name);//isme to variable object pass kia hai , or constructor banaya hai
    }

//    public MyThread(String name){
//        super(name);
//    }

    @Override
    public void run() {
        for (int i =0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count" + i);
            //to stimulate some works
            try {
                Thread.sleep(100);
            }catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
//        MyThread t1 = new MyThread("Aryan");
//        t1.start();
        SetPriority t1 = new SetPriority("Aryan");
        t1.start();
    }
}
