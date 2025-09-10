package All;

import java.util.ArrayList;
import java.util.List;

@VeryImportant("Take care of him!")
public class Dog extends Animal {

    @Override // <- Override method
    public void makeSound(){
        System.out.println("The dog made a sound");
    }

    @Deprecated
    public void markTerritory(){
        System.out.println("The dog pees in a nearby tree..");
    }

    @SuppressWarnings("unchecked")
    public void listCaretakers(){
        List list = new ArrayList<>();
        list.add("Anna");
        list.add("Berg");
        list.add("Carlos");
        System.out.println("Caretakers: " + list);
    }
}
