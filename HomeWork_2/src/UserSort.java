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
}
