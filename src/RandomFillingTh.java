import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomFillingTh extends Thread{

    public int[] RandomArray(int[] arr){
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(101) + 1;
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("Массив заполнен!");

        return arr;
    }
}
