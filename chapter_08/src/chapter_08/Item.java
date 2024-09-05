package chapter_08;

public class Item {
    public int id;
    public String description;
    public int quantity;
    public double price;
    public char color;

    public void setColor(char color) {
        this.color = color;
    }

    public void setItemFields(int id, int quantity, double price){
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public int setItemFields(int id, String description, int quantity, double price){
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        return 0;
    }

    public String getDescription() {
        return description;
    }
}


