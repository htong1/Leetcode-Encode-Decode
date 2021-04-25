package guava.math;

public class Stats {
    public static double meanOf(int... values){
        double num = 0;
        for(int i = 0; i < values.length; i++){
           num += values[i];
        }
        return num = num/values.length;
    }

    public static int min(int ...values){
        int min = values[0];
        for(int i = 1; i < values.length; i++){
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int ...values){
        int max = values[0];
        for(int i = 1; i < values.length; i++){
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
