public class MyClass {
    public static void InsertionSort(int[] arr, int size){
        int key = 0;
        int j = 0;
        for(int i = 1; i < size; i++){
            key = arr[i];
            j = i-1;
        
        while(j >= 0 && key < arr[j]){
            arr[j+1] = arr[j];
            j = j -1;
        }
        arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,1,4,3,5,9,8};
        int n = arr.length;
        System.out.println("Insert Sort Implementation: ");
        InsertionSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

