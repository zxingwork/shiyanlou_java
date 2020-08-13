public class CatchException {
    public static void main(String[] args) {
        try {
            System.out.println("i am try block.");
            Class<?> tempClass = Class.forName("");
            System.out.println("Bye!Try block.");
        } catch (Exception e) {
            System.out.println("I am a catch block.");

//            e.printStackTrace();
            System.out.println(e);

            System.out.println("Goodbye!Catch block");
        }finally {
            System.out.println("I am finally block.");
        }
    }
}
