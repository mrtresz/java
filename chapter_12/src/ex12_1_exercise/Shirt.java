package ex12_1_exercise;

public class Shirt extends Item{
    private String color;
    private String size;

    public Shirt(String color, String size,String desc,double price) {
        super(desc,price);
        this.color = color;
        this.size = size;
    }
}
