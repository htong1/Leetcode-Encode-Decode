package guava.math;
import java.util.*;

public class Stats {
    public static double meanOf(int... values) {
        double num = 0;
        for (int i = 0; i < values.length; i++) {
            num += values[i];
        }
        return num = num / values.length;
    }

    public static int min(int... values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int... values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    public static int median(int... values) {
        for (int i = 0; i < values.length; i++) {
            int index = i;
            int min = values[i];
            for (int u = i + 1; u < values.length; u++) {
                if (values[u] < min) {
                    min = values[u];
                    index = u;
                }
            }
        }
        return 0;
    }

    /*implement a new method*/
   public static double itmeanOf(Iterator<? extends Number> iterator){
    double num = 0;
    int next = 0;
    int length = 0;
    while(iterator.hasNext()){
        next = (int)iterator.next();
        num += next;
        length++;
    }
    num = num/length;
    return num;
}
}
