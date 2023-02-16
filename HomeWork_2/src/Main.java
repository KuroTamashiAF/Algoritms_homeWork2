import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int [] numbers  =  new int[10];
        ArrayPreparation.fillArray(numbers);
        ArrayPreparation.PrintArray(numbers);
        ArrayPreparation.separator();
        UserSort.sort(numbers);
        ArrayPreparation.PrintArray(numbers);
        ArrayPreparation.separator();




    }
}