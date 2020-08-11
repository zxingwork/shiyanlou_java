import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public List<Student> students;

    public ListTest(){
        this.students = new ArrayList<Student>();
    }

    public void testAdd(){
        Student st1 = new Student("1", "张三");
        students.add(st1);

        Student temp = students.get(0);
        System.out.println("添加了学生："+temp.id+":"+temp.name);

        Student st2 = new Student("2","李四");
        students.add(0, st2);
        Student temp2 =students.get(0);
        System.out.println("添加了学生："+temp2.id+temp2.name);

        Student[] student = {new Student("3","王五"), new Student("4", "马六")};

        students.addAll(Arrays.asList(student));
        Student temp3 = students.get(2);
        Student temp4 = students.get(3);
        System.out.println("添加了学生："+temp2.id+":"+temp2.name);
        System.out.println("添加了学生："+temp2.id+":"+temp2.name);

        Student[] student2 = {new Student("5","周七"), new Student("6", "赵八")};
        students.addAll(2, Arrays.asList(student2));
        Student temp5 = students.get(2);
        Student temp6 = students.get(3);

        System.out.println("添加了学生："+temp5.id+":"+temp5.name);
        System.out.println("添加了学生："+temp6.id+":"+temp6.name);
    }

    public void testGet(){
        int size = students.size();
        for (int i = 0; i<size; i++){
            Student st = students.get(i);
            System.out.println("学生："+st.id+":"+st.name);
        }
    }

    public void testIterator(){

    }
}
