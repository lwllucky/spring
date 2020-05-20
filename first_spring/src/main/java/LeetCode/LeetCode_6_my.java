package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auter liwinallucky
 */
public class LeetCode_6_my {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        List<StringBuilder> list=new ArrayList<StringBuilder>();
        for (int i = 0; i <Math.min(numRows,s.length()) ; i++) {
            list.add(new StringBuilder());
        }
        int a=0;
        boolean b=false;
        for (char c:s.toCharArray()
             ) {
            list.get(a).append(c);
            if(a==0||a==numRows-1){
                b=!b;
            }
            a+=b?1:-1;
        }
        StringBuilder d=new StringBuilder();
        for (StringBuilder f:list
             ) {
            d.append(f);
        }
        return d.toString();
    }
}
