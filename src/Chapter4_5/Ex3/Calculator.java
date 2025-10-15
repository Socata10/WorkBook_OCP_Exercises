package Chapter4_5.Ex3;

public class Calculator {
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }
    double add(int a, double b){
        return a + b;
    }
    double add(double a, int b){
        return a + b;
    }
    static void main() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.5, 2.5));
        System.out.println(calculator.add(1, 2.5));
    }
}

