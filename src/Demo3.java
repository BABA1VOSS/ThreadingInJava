//Thread Id and Thread Name
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        // isme hum get name () directly use nahi kar sakte hai kyunki yeh static object nahi hai , or static object ke lie humesha static object hi use hota hai , .currentThread() ek static object hai to wo use kar ke humne get name call kia

        Thread t1 = new Thread(() -> {
            System.out.println("Name of my thread is " + Thread.currentThread().getName());
            System.out.println("Id of my thread is " + Thread.currentThread().getId());
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Name of my 2ndthread is " + Thread.currentThread().getName());
            System.out.println("Id of my 2ndthread is " + Thread.currentThread().getId());
        });
        t1.start();
        t2.start();
    }
}
//ab isko mein run karunga to dekhunga ki java jo hai order preserve nahi karta hai wo kuch race conditions hoti hai unki wajhah se vo kaise bhi Thread ko execute kar ke print kara dega jaise id 2nd ki pehle 1st ki bad mein ya iska oolta