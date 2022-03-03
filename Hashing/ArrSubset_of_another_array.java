import java.util.*;
/*
Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]
*/ 

public class MyClass {
    public static boolean isSubset(int[] a1, int[] a2){
        //use hashSet
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < a1.length; i++){
            hash.add(a1[i]);
        }
        for(int j = 0; j < a2.length; j++){
            if(!hash.contains(a2[j]))
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        int a1[] = {11, 1, 13, 21, 3, 7,9};
        int a2[] = {11, 3, 7, 1,9};
        System.out.println(isSubset(a1, a2));
    }
}

