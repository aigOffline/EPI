    // Driver method
    public static void main(String args[])
    {
      
        int arr[] = {1, 2, 3, 4, 5};
        //2 1 4 3 5 
        int n = arr.length;
         Arrays.sort(arr);
 
        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2){
          //  swap(arr, i, i+1);
            int temp ;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i : arr)
            System.out.print(i + " ");
    }

}
