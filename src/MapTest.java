
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    public Map<String, Course> courses;

    public MapTest(){
        this.courses = new HashMap<String, Course>();
    }

    public void testPut(){
        Scanner console = new Scanner(System.in);

        for (int i = 0; i<3; i++){
            System.out.println("請輸入課程ID：");
            String ID = console.next();
            Course cr = courses.get(ID);

            if (cr == null){
                System.out.println("請輸入課程名稱：");
                String name = console.next();

                Course newCourse = new Course(ID, name);
                courses.put(ID, newCourse);
                System.out.println("成功添加課程："+courses.get(ID).name);
            }
            else {
                System.out.println("該課程ID已被占用");
//                continue;
            }
        }
    }

    /**
     * 測試Map的KeySet方法
//     * @param args
     */
    public void testKeySet(){
        Set<String> keySet = courses.keySet();

        for (String crID: keySet){
            Course cr = courses.get(crID);
            if (cr != null){
                System.out.println("課程："+cr.name);
            }
        }
    }

    /**
     * 測試刪除Map中的映射
     */
    public void testRemove(){
        Scanner console = new Scanner(System.in);
        while (true){
            System.out.println("請輸入要刪除的課程ID：");
            String ID = console.next();
            Course cr = courses.get(ID);
            if (cr == null){
                System.out.println("該ID不存在");
                continue;
            }
            courses.remove(ID);
            System.out.println("成功刪除課程："+cr.name);
            break;
        }
    }


}
