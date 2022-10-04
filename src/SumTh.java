import java.text.SimpleDateFormat;
import java.util.Date;

public class SumTh extends Thread {

    public int Sum(int[] arr) {
        int curRes = 0;
        for (int i = 0; i < arr.length; i++) {
            curRes += arr[i];
        }

        return curRes;
    }
}
