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
            String a = "";
            for (int j =0; j < 10; j++){
                a += "a";
            }
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count" + i);
                //to stimulate some works
                try {
                    Thread.sleep(10);
                }
                catch (Exception e) {

                }


        }
    }

    public static void main(String[] args) {
//        MyThread t1 = new MyThread("Aryan");
//        t1.start();
        SetPriority l = new SetPriority("Low priority Thread");
        SetPriority m = new SetPriority("Medium Priority Thread");
        SetPriority h = new SetPriority("High priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);  -- > 1
//        t1.setPriority(Thread.MAX_PRIORITY);  --> 10
//        t1.setPriority(Thread.NORM_PRIORITY);   --> 5
        l.start();
        m.start();
        h.start();
    }
}


//koi Strict rule nahi hai priority ka jo dedia to whai run karega yeh ek simply hint hai bas jis hint ke through yeh aage OS badhta hai bas hints
