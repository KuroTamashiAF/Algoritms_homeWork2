public class ArrayPreparation {

    public static int[] fillArray(int [] arr)
    {
        if (arr.length == 0){
            throw new RuntimeException("Пришли крывые данные");
        }
        for( int i =0;  i <arr.length; i++){
            arr[i] = (int) (Math.random()* 100);
        }
        return arr;
    }
    public static void PrintArray(int[] arr){
        for (int i = 0; i <arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }

    }
    public static void separator(){
        System.out.println("\n--------------------------------------------");
    }
}
