package test;

/**
 * @auter liwinallucky
 */
public class Year {
    public void NextDate(int month,int day,int year){
        if(year%4==0){
            if(month==2){
                if(day==29){
                    System.out.println((month+1)+"-"+"1"+"-"+year);
                }else{
                    System.out.println(month+"-"+(day+1)+"-"+year);
                }
            }else if(month%2==0){
                if(day==30){
                    System.out.println((month+1)+"-"+"1"+"-"+year);
                }
                System.out.println();
            }else{

            }
        }
    }
}
