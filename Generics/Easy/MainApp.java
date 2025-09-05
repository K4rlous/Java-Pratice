package Easy;

public class MainApp {
    public static void main(String[] args) {

        // 01 - Box
        Box<String> stringBox = new Box<>("This is a box with a string");
        Box<Integer> integerBox = new Box<>(20);
        Box<GenericObjectPerson> personBox = new Box<>(new GenericObjectPerson("Anna", 20));

        System.out.println(stringBox.getContent());
        System.out.println(integerBox.getContent());
        System.out.println(personBox.getContent().toString());

        // 02 - Array Printer

        Integer[] numbers = {1,2,3,4,5}; // Use Integer[] instead of int[] for generics support
        String[] names = {"Carlos", "Anna", "Bob", "David"};

        printArray(numbers);
        printArray(names);

        // 03 - Array Swap

        swapArray(numbers, 0, 4);
        swapArray(names, 0, 2);

        printArray(numbers);
        printArray(names);


    }

    // Array printer
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print("Element: " + element);
            System.out.println();
        }
    }

    // Array swap
    public static <T> void swapArray(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
