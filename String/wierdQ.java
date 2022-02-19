import java.util.*;
import java.util.Arrays;
public class MyClass {

    static int BadOrGood(String str)
    { 
        HashSet<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int vow = 0, count = 0;
        if(set.contains(str.charAt(0)))
            vow++;
        else if(str.charAt(0) != '?')
            count++;
        else
        {
            vow++;
            count++;
        }
        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i)))
            {
                count = 0;
                vow++;
            }else if(str.charAt(i) != '?'){
                vow = 0;
                count ++;
            }else{
                vow++;
                count++;
            }if(vow >5){
                return 0;
            }if(count >3){
                return 0;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
    //String S = "bcdaeiou??";
    //String S = "abc";  //Good -1
    // String S = "aaa?aaafff"; //bad 0
    //String S = "?aaaaffaaf?aaaafff"; //bad 0
    String S1 =  "vabb?aaaadadada" ;//bad
    //System.out.print(BadOrGood(S));
    System.out.print(BadOrGood(S1));
    }
}



