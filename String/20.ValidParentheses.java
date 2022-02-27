import java.util.*;
public class MyClass {
    public static boolean paranthesis(String str){
        //to store
    Deque <Character> stack = new ArrayDeque <Character>();
        //itirate 
    for(int i = 0; i < str.length(); i++){
        //convert 
        char x = str.charAt(i);
        if(x == '{' || x == '[' || x == '('){
            stack.push(x);
            continue;
        }
        //nothing in stack 
        if(stack.isEmpty())
            return false;
        //check if we have closing brackets
        char check;
        switch(x){
            case '}':
                //now we need to remove incorrect ones;
                check = stack.pop();
                if(check == ']' || check == ')')
                    return false;
                break;
            case ')':
                //now we need to remove incorrect ones;
                check = stack.pop();
                if(check == ']' || check == '}')
                    return false;
                break;  
            case ']':
                //now we need to remove incorrect ones;
                check = stack.pop();
                if(check == '}' || check == ')')
                    return false;
                break;
        }
        
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String str = "(){}{}";
        if( paranthesis(str))
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");
    }
}

