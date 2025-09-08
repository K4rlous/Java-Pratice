package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MainApp {
    public static void main(String[] args) {

        // 01 - Pair swap
        Pair<String, Integer> p1 = new Pair<>("Age", 20);
        System.out.println(p1);

        Pair<Integer, Integer> p2 = new Pair<>(50, 20);
        System.out.println(p2);
        p2.swap();
        System.out.println(p2);

        // 02 - Sum of list
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 2.5, 54.4);

        System.out.println("Sum of 'intList': " + sumOfList(intList));
        System.out.println("Sum of 'doubleList': " + sumOfList(doubleList));

        // 03 - Copy list
        List<Integer> src = Arrays.asList(10, 20, 30);
        List<Integer> dest = new ArrayList<>();
        copyList(src, dest);
        System.out.println("Copied List: " + dest);
    }

    public static double  sumOfList(List<? extends Number> list){
        double totalSum = 0;
        for(Number element : list){
            totalSum += element.doubleValue();
        }
        return totalSum;
    }

    // PECS (Producer Extends, Consumer Super) Pattern!
    // Copies elements from source to destination using PECS:
    // ? extends T = producer (read), ? super T = consumer (write)
    public static <T> void copyList(List<? extends T> source, List<? super T> destination){
        for(T element : source){
            destination.add(element);
        }
    }
}
