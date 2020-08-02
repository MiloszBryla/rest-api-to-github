package rafal;

import java.util.ArrayList;
import java.util.List;

public class Quarter {
    public Quarter(Item item) {
        itemsList.add(item);
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    private List<Item> itemsList = new ArrayList<>();
}
