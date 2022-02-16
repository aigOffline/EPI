import java.util.Arrays;
public class MyClass {
  
  public static void removeDuplicate(int arr[], int n) {

    int j = 0;
    
    // traverse elements of arr
    for (int i = 0; i < n-1; i++) 
    {
        // if ith element is not equal to (i+1)th element, then store ith value in arr[j]
        if (arr[i] != arr[i+1]) 
        {
            arr[j] = arr[i];
            j++;
        }
    }

    // store last value of arr in arr[j]
    arr[j++] = arr[n-1];
    
    // print first j elements of array arr
    
    for (int i = 0; i < j; i++) 
    {
        System.out.print(arr[i]+" ");
    }
}

	public static void main (String[] args)
	{
	    int arr[] = {1, 3, 5, 5, 7, 9};
	    int n = arr.length;
	    // calling function when number of elements in array is greater than 1
	  
	    
	      removeDuplicate(arr, n);
	    
   
	    
	}
   
   
   
    
}
