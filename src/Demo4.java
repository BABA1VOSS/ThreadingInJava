//Start() or run()
//humne generally yeh dekha hai ki jab bhi hum Thread banate hai to usko call karne ke lie we are using  Start(), or humari run interace ke under ek runnable interface hota hai or exactly hum ussi ko call kar rhe hote hai to directly kyu nahi karte ?

public class Demo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("current thread is " + Thread.currentThread().getName());
        });

        t1.start();//---->bina start ke koi Thread banegi hi ni , run method useful ni hai wo main Thread hi show karegi
        t1.run();
    }
}
//ek interview question hai ki start() or run () main se kon sa karna chaiye
//Question 2 -->kya hum ek hi thread ko 2 bar chalu kar sakte hai ?
// Answer -2 ->NO , because it throws us an exception called illegal State exception ..
//ek bari agar thread ko start kia to wo bas terminate hogi , lifecycle ke corresponding koi alag thread execute nahi hogi