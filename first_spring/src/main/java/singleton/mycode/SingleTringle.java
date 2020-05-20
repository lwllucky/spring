package singleton.mycode;

/**
 * @auter liwinallucky
 */
public class SingleTringle {
    private static SingleTringle instence=new SingleTringle();
    private SingleTringle(){}
    public static SingleTringle getInstence(){
        if(instence==null){
            instence=new SingleTringle();
        }
        return instence;
    }
    public void showmessage(int a,int b,int c){
        if(a+b>c&&a+c>b&&b+c>a){
            if(b*b+c*c>a*a){
                System.out.println("锐角三角形");
            }else if(b*b+c*c==a*a){
                System.out.println("直角三角形");
            }else if(b*b+c*c<a*a){
                System.out.println("钝角三角形");
            }
        }else{
            System.out.println("不是三角形");
        }
    }
}
