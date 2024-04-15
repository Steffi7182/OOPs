import arithmetic.ArithmeticOperations;
import java.util.Scanner;
public class ArithmeticMain {
public static void main(String[] args) {
System.out.println(" Steffi Antony\n Roll No: 54\n Date:09-04-2024\n Program title: Arithmetic package\n");
ArithmeticOperations operations = new ArithmeticOperations();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
double num1 = scanner.nextDouble();
System.out.print("Enter the second number: ");
double num2 = scanner.nextDouble();
System.out.println("Addition: " + operations.add(num1, num2));
System.out.println("Subtraction: " + operations.subtract(num1, num2));
System.out.println("Multiplication: " + operations.multiply(num1, num2));
System.out.println("Division: " + operations.divide(num1, num2));
}
}

