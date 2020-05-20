package singleton.cainiao;

/**
 * @auter liwinallucky
 */
public class ClassTeacher {
    private static ClassTeacher teacher;
    private ClassTeacher(){}
    public static ClassTeacher getInstance(){
        if(teacher==null){
            teacher=new ClassTeacher();
        }
        return teacher;
    }

    public void showMessage(){
        System.out.println("我是班主任！！！");
    }
}
