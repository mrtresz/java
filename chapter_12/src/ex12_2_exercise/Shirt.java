package ex12_2_exercise;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    public char getSize(){
        return size;
    }

    public char getColorCode(){
        return colorCode;
    }
    
    // Override display() in the superclass to also show size and colorCode.
    public void display(){
        System.out.println("Shirt's price is " + getPrice());
        System.out.println("Description: " + getDesc());
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColorCode());
    }
    //   Avoid duplicating code.
}
