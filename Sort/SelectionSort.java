public class MyClass {
    public static void SelectionSort(int[] arr, int size){
       for(int i = 0; i < size-1; i++){
           int min_idx = i;
                for(int j = i+1; j < size; j++)
                if(arr[j] < arr[min_idx])
                min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
       }
    }
    public static void main(String[] args){
        int[] arr = {2,1,4,3,5,9,8};
        int n = arr.length;
        System.out.println("Selection Sort Implementation: ");
        SelectionSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
