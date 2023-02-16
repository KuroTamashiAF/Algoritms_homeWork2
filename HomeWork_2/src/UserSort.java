public class UserSort {

    public static void heapIfy(int [] arr, int heapSize, int rootIndex){
        int theLargest  = rootIndex;
        int leftChild  = 2*rootIndex + 1;
        int rightChild  =  2*rootIndex+2;

        if (leftChild< heapSize && arr[leftChild] > arr[theLargest])
            theLargest = leftChild;
        if (rightChild <heapSize && arr[rightChild]> arr[theLargest] )
            theLargest = rightChild;

        if (theLargest !=rootIndex){
            int temp  = arr[rootIndex];
            arr[rootIndex] = arr[theLargest];
            arr[theLargest] = temp;
        }
        heapIfy(arr,heapSize, theLargest );
    }

    public static void sort(int [] arr ){
        for( int i = arr.length/2 -1 ;i>=0;i--){
            heapIfy(arr, arr.length, i);
        }
        for(int i  = arr.length-1;i>=0;i--){
            int temp  =  arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapIfy(arr, i, 0);
        }
    }
}
