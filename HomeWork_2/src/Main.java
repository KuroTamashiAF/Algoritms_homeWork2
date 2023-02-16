import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        ArrayPreparation test = new ArrayPreparation();
        int [] numbers  =  new int[10];
        test.fillArray(numbers);
        test.separator();
        test.PrintArray(numbers);
        test.separator();



    }
}