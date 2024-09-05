
package ex10_2_exercise;

public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
         if(custType == NONPROFIT && total > 900){
             this.discount = 10;
         }else{
             discount = 8;
         }

         if(custType == PRIVATE && total > 900){
             discount = 7;
         }else{
             discount = 0;
         }

         if(custType ==  CORP && total > 500){
             discount = 8;

         }else{
             discount = 5;
         }

         switch(custType){
             case NONPROFIT -> discount = (total > 900) ? 10 : 8;
             case PRIVATE -> discount = (total > 900) ? 7 : 0;
             case CORP -> discount = (total > 500) ? 8 : 5;
         }

    }
}
