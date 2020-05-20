package test;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @auter liwinallucky
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println("输入三角形的三条边");
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
//        ArrayList<Character> arrayList1=new ArrayList<Character>();
//        arrayList1.add('a');
//        arrayList1.add('b');
//        arrayList1.add('c');
        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("第一条边");
        arrayList1.add("第二条边");
        arrayList1.add("第三条边");
        for (int i = 0; i < 3; i++) {
            do{
                System.out.println("输入"+arrayList1.get(i));
                arrayList.add(i,sc.nextInt());
            }while(arrayList.get(i)<1||arrayList.get(i)>100);
        }
        if(arrayList.get(0)+arrayList.get(1)>arrayList.get(2)&&arrayList.get(0)+arrayList.get(2)>arrayList.get(1)&&arrayList.get(1)+arrayList.get(2)>arrayList.get(0)){
            System.out.println("是三角形");
        }else {
            System.out.println("不是三角形");
        }
        //等价类划分判断
        if(arrayList.get(0)+arrayList.get(1)<=arrayList.get(2)||arrayList.get(1)+arrayList.get(2)<=arrayList.get(0)||arrayList.get(2)+arrayList.get(0)<=arrayList.get(1)){
            System.out.println("不是三角形");
        }
    }
}
