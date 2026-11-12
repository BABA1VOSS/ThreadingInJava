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

