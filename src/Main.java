import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        final int size = 50;
        int[] array = new int[size];

        RandomFillingTh fill = new RandomFillingTh();
        SumTh sum = new SumTh();
        AverageTh average = new AverageTh();

        fill.start();
        sum.start();
        average.start();

        fill.RandomArray(array);
        while(fill.isAlive()){
            try{
                sum.join();
                average.join();
            }catch (InterruptedException e){}
        }

        System.out.println();

        System.out.println("Сумма всех чисел в массиве равна " + sum.Sum(array));

        System.out.println("Среднее арифметическое всех чисел в массиве " + average.Average(array));


    }

}
