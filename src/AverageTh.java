import java.text.SimpleDateFormat;
import java.util.Date;

public class AverageTh extends Thread{

    public int Average(int[] arr) {
        int curRes = 0;
        for (int i = 0; i < arr.length; i++) {
            curRes += arr[i];
        }

        return curRes/arr.length;
    }

}
