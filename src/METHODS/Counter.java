package METHODS;

public class Counter {

    private int count = 0;

    public void  increment (){//pehle hum dekh rhe the ki synchronized keyword ka use ni kia to exact value ni aarhi thi jaise humne iska use kia wese hi iska value exact aane laga
        //count++;
    //ab jaise mujhe ek block of code ko hi synchronize karna hai bas, to main synchronize keyword ko kuch is prakar likhunga
        synchronized (this){//this means ek instance jsiep increment method call ho rha hai agar usko multiple thread kar rhe hai to ek bar main ek hi thread access kar payega..
            count++;
        }//critical section bolte hai jaha synchronized use hota hai -- agar hum synchornized ka use nahi kar rhe the tab oolta seedha result aarha tha kyunki tab thrad ki relative timing par depend kar rha tha outcome becoz thread concurrently run kar rha the isliye result unpredictable aarha tha .. iss condition ko jab synchronization ko use ni kar rhe the to usko RACE CONDITION BOLTE HAI
        //or jab race condition hataya to kya samjha ek bar main ek hi resource acess kar skta hai or usko bolte hai mutual exclusion (it ensures that multiple thread simultaneously cannot access the critical section or shared resource ).
    }
    public int getCount(){
        return count;
    }
}
//use of synchronized method
