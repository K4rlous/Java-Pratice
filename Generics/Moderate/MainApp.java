package Moderate;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        // 01 - Find the biggest element in the array
        String[] names = {"Carlos", "Anna", "David", "Felix", "Alexander"};
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println(findBiggestElement(names));
        System.out.println(findBiggestElement(numbers));

        // "Felix" > "Alexander" because Strings are compared lexicographically

        // 02 - Count greater than...
        System.out.println("How many elements are greater than '5': " + countGreaterThan(numbers, 5));
        System.out.println("How many elements are greater than 'Zack': " + countGreaterThan(names, "Zack"));
        // Remember, Zack is the biggest element because they're compared lexicographically

        // 03 - Replace greater than...
        System.out.println("Numbers after replacing number bigger than '2' for '7': " + Arrays.toString(replaceGreaterThan(numbers, 2, 7)));
        System.out.println("Names after replacing names bigger than 'Carlos' lexicographically with 'Maxwell': " + Arrays.toString(replaceGreaterThan(names, "Carlos", "Maxwell")));

    }

    public static <T extends Comparable<T>> T findBiggestElement(T[] array){
        if(array == null || array.length == 0) return null;
        T max = array[0];
        for(T element : array){
            if(element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T input){
        int count = 0;
        for(T element : array){
            if (element.compareTo(input) > 0){
                count++;
            }
        }
        return count;
    }

    public static <T extends Comparable<T>> T[] replaceGreaterThan(T[] array, T keyElement, T replacer){
        for(int i = 0; i < array.length; i++){
            if (array[i].compareTo(keyElement) > 0) {
                array[i] = replacer;
            }
        }
        return array;
    }

}
