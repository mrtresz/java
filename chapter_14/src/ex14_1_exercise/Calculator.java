package ex14_1_exercise;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    // This method could throw an ArithmeticException
    public double divide(double x, double y) throws ArithmeticException{
        if(y == 0){
            y = 1.0;
        }
        return x / y;
    }
}
