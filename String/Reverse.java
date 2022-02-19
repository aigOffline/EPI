import java.util.*;
import java.util.Arrays;
public class MyClass {
    public static void main(String[] args)
    {
        String input = "Reverse me";
        char[] toConvertChar = input.toCharArray();
        
        for(int i = toConvertChar.length-1; i >= 0; i--){
            System.out.print(toConvertChar[i]);
        }            
    }  
}


