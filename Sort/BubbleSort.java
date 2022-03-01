public class MyClass {
    public static void BubbleSort(int[] arr, int size){
        //for swap
        int temp = 0;
        //iterate from all arr
        for(int i = 0; i < size; i++)
        //for swap iteration
            for(int j = 0; j < size-i-1; j++)
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static void main(String[] args){
        int[] arr = {2,1,4,3,5,9,8};
        int n = arr.length;
        System.out.println("Bubble Sort Implementation: ");
        BubbleSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

