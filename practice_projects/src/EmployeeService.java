import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset = new HashSet<>();


    Employee emp1 = new Employee(101,"Andile",25,"DJ","Mixer",20000);
    Employee emp2 = new Employee(102,"Nhlakanipho",23,"IT","Developer",50000);
    Employee emp3 = new Employee(103,"McDonald",24,"CFO","Financial Officer",60000);
    Employee emp4 = new Employee(104,"Ben",24,"COO","Operations Officer",60000);

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    public EmployeeService() {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }

//    view all employees
    public void viewAllEmployees() {
        for (Employee emp : empset) {
            System.out.println(emp);
        }
    }

//    view employee based on id;
    public void viewEmployee() {
        boolean found=false;

        System.out.println("Enter Employee ID: ");
        Scanner sc1 = new Scanner(System.in);
        int id = sc1.nextInt();
        for (Employee emp : empset) {
            if (emp.getId() == id) {
                System.out.println(emp);
                found=true;
            }
        }

        if(!found) {
            System.out.println("Employee Not Found");
        }
    }

//    update employee
    public void updateEmployee(){
        boolean found=false;

        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee emp : empset) {
            if(emp.getId() == id) {
                System.out.println("Enter Employee Name: ");
                String name = sc.next();
                System.out.println("Enter Employee Age: ");
                int age = sc.nextInt();
                System.out.println("Enter Employee Designation: ");
                String designation = sc.next();
                System.out.println("Enter Employee Department: ");
                String department = sc.next();

                System.out.println("Enter Employee Salary: ");
                double sal = sc.nextDouble();
                emp.setName(name);
                emp.setAge(age);
                emp.setDepartment(department);
                emp.setDesignation(designation);
                emp.setSalary(sal);
                empset.add(emp);
                System.out.println("Employee Updated");
                System.out.println(emp);
                found=true;
                break;
            }
            if(!found) {
                System.out.println("Employee Not Found");
            }
        }

    }

//    delete employee
    public void deleteEmployee() {

        boolean found=false;
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee emp : empset) {
            if(emp.getId() == id) {
                found=true;
                empset.remove(emp);
                System.out.println("Employee Deleted successfully");
                break;

            }

            if(!found) {
                System.out.println("Employee Not Found");
            }
        }
    }

//    add employee
    public void addEmployee(){
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Designation: ");
        designation = sc.nextLine();
        System.out.println("Enter Employee Department: ");
        department = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        sal = sc.nextDouble();

        Employee emp = new Employee(id,name,age,designation,department,sal);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee Added successfully");






    }

}
