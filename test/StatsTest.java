package test;
import guava.math.Stats;
import java.util.*;

public class StatsTest {
    public static void main(String [] args){
       double m1 = 0, m2 = 2, m3 = 5;
       m1 = Stats.meanOf(1,2);
       m2 = Stats.meanOf(1,2,3);
       int [] arr = {1,2,3,3,4,5,5,6,78,8};
       m3 = Stats.meanOf(arr);
       System.out.println("m1 " + m1);
       System.out.println("m2 " + m2);
       System.out.println("m3 " + m3);
       int welp = 0;
       welp = Stats.min(arr);
       System.out.println("Min:" + welp);
       int welp2 = 0;
       welp2 = Stats.max(arr);
       System.out.println("Max:" + welp2);
       int middle = 0;
       middle = Stats.median(arr);
       System.out.println("Median:" + middle);
       ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        Iterator<Integer> iterator = list.iterator();
        double itMean = Stats.itmeanOf(iterator);
        System.out.println("Mean found using iterator: " + itMean);
        double iterableMean = Stats.iterablemeanOf(list);
        System.out.println("Iterable mean:" + iterableMean);
    }
}
