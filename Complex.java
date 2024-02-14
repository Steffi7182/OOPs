
import java.util.Scanner;

public class Complex{
    public static void main(String[] args){
    System.out.println(" Steffi Antony\n Roll No: 54\n Date:13-02-2024\n Program title: Complex Number\n");
      
     class ComplexClass{
         int real;
         int img;
         public ComplexClass(int r, int i) {
            this.real = r;
            this.img = i;
            }
        }
      Scanner read = new Scanner(System.in);
      System.out.println("Enter the first complex number:");
      System.out.print("Real part : ");
      int a = read.nextInt();
      System.out.print("Imaginary part : ");
      int b = read.nextInt();
      ComplexClass first = new ComplexClass(a,b);

      System.out.println("Enter the second complex number:");
      System.out.print("Real part : ");
      a = read.nextInt();
      System.out.print("Imaginary part : ");
      b = read.nextInt();
      ComplexClass second = new ComplexClass(a,b);

      int real = first.real + second.real;
      int img = first.img + second.img;
      System.out.println("Sum of the Complex Number is:" + real + " + " + img + "i");
    }
}
