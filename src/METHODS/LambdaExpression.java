package METHODS;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello");
        }; //Lambda expression(Anonymous functions)
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
//Functional Interface -> is an interface contains exactly one abstract Method(woh interface jinki koi alag se body nahi hai wahi wale interface)
//runnable kya hai ek functional interface hai

//jis bhi method ko lambda expression main convert karna ho, usme return type hata do
// 1. rakhna hai bas bracket () ISSI MAIN PARAMETER fir body ke beech main arrow dal do -->  {;};
//example-------> Student lawStudent = (String name)  -> {return name + " is law student";};
