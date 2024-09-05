package ex12_3_exercise;

public class Shirt extends Item{
    private char size;
    private char colorCode;

    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ getColor(colorCode));
    } 
    
    // Code a public getColor method that converts the colorCode to the color name
    // Use a switch statement.  Return the color name.
    public String getColor(char colorCode){
        switch(colorCode){
            case 'B': return "Black";
            case 'G': return "Green";
            case 'R': return "Red";
            case 'P': return "Yellow";
            default: return null;
        }

    }

}
