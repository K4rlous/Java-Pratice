package Hard;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public void useItem(String itemName){
        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
            if(item.getName().equals(itemName)){
                item.use();

                // If the potions end, they get removed from the list
                if(item instanceof Potion && item.getQuantity() <= 0){
                    itemList.remove(i);
                    System.out.println(itemName + " has been removed from inventory (quantity 0)");
                }
                break; // Exit the loop after using
            }
        }
    }
}
