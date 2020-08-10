public class People {
    private String name = "LiLei";

    public class Student{
        String ID = "20151234";

        public void stuInfo(){
            System.out.println("访问外部类中的name"+name);
            System.out.println("访问内部类中的ID"+ID);
        }
    }

    public static void main(String[] args) {
        People a = new People();
        Student b = a.new Student();
        b.stuInfo();
    }
}
