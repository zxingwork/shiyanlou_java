public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest tester = new LambdaTest();
        MathOperation addition = (int a, int b)->a+b;
        MathOperation subtraction = (int a, int b)->a-b;
        MathOperation multiplication = (int a, int b)->{return a*b;};
        MathOperation division = (int a, int b)->a/b;

        System.out.println("10+5="+tester.operate(10, 5, addition));


    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
