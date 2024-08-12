import java.util.Arrays;
import java.util.Scanner;

public class Tz1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int  arrayLengh = in.nextInt();
        Double min, max, avg;
        Double[] array = new Double[arrayLengh];
        for (int i=0; i<arrayLengh; ++i) {
            array[i]=Math.random();
        }

        max=array[0];
        for (int i=0; i<arrayLengh; ++i) {
            if (array[i] > max) {max = array[i];}
        }

        min=array[0];
        for (int i=0; i<arrayLengh; ++i) {
            if (array[i] < min) {min = array[i];}
        }

        avg=Arrays.stream(array).mapToDouble(x -> x.doubleValue()).sum()/array.length;

        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}
