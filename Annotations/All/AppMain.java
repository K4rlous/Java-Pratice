package All;

public class AppMain {
    public static void main(String[] args) {

        // 01 - Override check
        Dog dog = new Dog();
        dog.makeSound();

        // 02 - Deprecated example
        dog.markTerritory(); // <- Deprecated method!

        // 03 - Suppress warnings
        dog.listCaretakers();

        // Custom annotation, using reflection to read it
        Class<Dog> dogClass = Dog.class;

        if(dogClass.isAnnotationPresent(VeryImportant.class)){
            VeryImportant annotation = dogClass.getAnnotation(VeryImportant.class);
            System.out.println("Annotation found: " + annotation.value());
        }

    }
}
