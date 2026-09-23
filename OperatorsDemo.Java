public class OperatorsDemo {
    void add(int a, int b){
        int sum = a + b;
        System.out.println("Addition:"+sum);

    }
    int multiply (int a, int b){
        return a * b;
    }

public static void main ( String[] args){
    
    byte a = 15, b = 10;
    int result = a + b;
    System.out.println("Arithematic Promotion Result:" + result);
    
    int x = 15, y = 5;
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x % y = " + (x % y));

    OperatorsDemo obj = new OperatorsDemo();
    obj.add(a , b);
    int product = obj.multiply(a, b);
    System.out.println("Multiplication:"+ product);
}
}
