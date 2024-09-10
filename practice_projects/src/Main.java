import java.util.Scanner;

public class Main {

    EmployeeService  service = new EmployeeService();

    static boolean ordering = true;

    public static void menu(){

        System.out.println("************** Welcome To Employee Service ***************"
                + "\n1. Add Employee "
                + "\n2. View Employee "
                + "\n3. Update Employee "
                + "\n4. Delete Employee "
                + "\n5. View All Employee "
                + "\n6. Exit"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        menu();

        do{
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1 -> {
                    service.addEmployee();
                }
                case 2 -> {
                    service.viewEmployee();
                }
                case 3 -> {
                    service.updateEmployee();
                }
                case 4 -> {
                    service.deleteEmployee();
                    service.viewAllEmployees();
                }
                case 5 -> {
                    service.viewAllEmployees();
                }
                case 6 -> {
                    System.out.println("Thank you for using our service");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice");
            }

        }while(ordering);


    }
}