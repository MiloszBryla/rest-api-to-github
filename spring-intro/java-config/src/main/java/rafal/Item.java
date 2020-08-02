package rafal;

public class Item {
    public Item(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Name='" + Name + '\'' +
                '}';
    }

    private String Name;
}
