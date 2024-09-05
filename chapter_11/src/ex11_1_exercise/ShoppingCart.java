package ex11_1_exercise;

// import statements here:
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;



public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM));
        System.out.println(formattedDate);


        
	// Initialize the orderDate to the current date and time. Print it.


	// Format orderDate using ISO_LOCAL_DATE; Print it.


    }
}