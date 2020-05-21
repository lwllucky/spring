package LeetCode;

/**
 * @auter liwinallucky
 * 超时了
 */
public class LeetCode_5_my {
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        int a=0,b=0,c=0,d=0;
        char ss[]=s.toCharArray();
        if(s.length()>1){
            if(ss[0]==ss[1]){
                c=0;
                d=1;
            }
        }
        for (int i = 1; i < s.length()-1; i++) {
            for (int j = 1; j <=i ; j++) {
                if(ss[i]==ss[i+1]){
                    a=i;
                    b=i+1;
                    if(i<s.length()-2) {
                        for (int k = 1; k <= i; k++) {
                            if(i+1+k<s.length()) {
                                if (ss[i - k] == ss[i + 1 + k]) {
                                    a = i - k;
                                    b = i + 1 + k;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                if(b-a>d-c){
                    c=a;
                    d=b;
                }
                if(ss[i]==ss[i-1]){
                    a=i-1;
                    b=i;
                }
                if(i+j<s.length()) {
                    if (ss[i - j] == ss[i + j]) {
                        a = i - j;
                        b = i + j;
                    } else {
                        break;
                    }
                }
                if(b-a>d-c){
                    c=a;
                    d=b;
                }
            }

        }
        return s.substring(c,d+1);
    }

    public static void main(String[] args) {
        LeetCode_5_my l=new LeetCode_5_my();
        System.out.println(l.longestPalindrome("bppbsooos"));
    }
}
