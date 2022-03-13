#include <iostream>
using namespace std;
int fib(int n){
    if(n <= 1)
        return n;
    return (fib(n-1) + fib(n-2));
}
// Driver Code
int main()
{
    int n = 14;
    //14th Fibonacci number is 377
    cout <<n <<" Fibonacci number: "  << fib(n);
    return 0;
}
==============================================
public class MyClass {
    public static int fib(int n){

    if(n <= 1)
        return n;
    return (fib(n-1) + fib(n-2));
    }
    public static void main(String args[]) {
     int n = 5;
     //14th Fibonacci number is 377
    System.out.println("Fibonacci series of 14 numbers is: " + fib(14));
    // for loop to print the fibonacci series.
    // for (int i = 0; i < n; i++)
    // {
    //     System.out.println(fib(i)+ " ");
    // }

    }
}


