import java.util.Scanner;

public class Matrix{
    public static void main(String[] args){
    System.out.println(" Steffi Antony\n Roll No: 54\n Date: 13-02-2024\n Program title: Matrix Addition\n");
      
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the rows(m1) and cols(n1) in the first matrix :");
        int m1 = read.nextInt();
        int n1 = read.nextInt();
        int[][] matrix1 = new int[m1][n1];
        System.out.println("Enter the first matrix:");
        for(int i=0; i<m1; i++)
        {
            for(int j=0;j<n1;j++)
            {
                matrix1[i][j] = read.nextInt();
            }
        }
        System.out.println("Enter the rows(m2) and cols(n2) in the second matrix :");
        int m2 = read.nextInt();
        int n2 = read.nextInt();
        int[][] matrix2 = new int[m2][n2];
        System.out.println("Enter the second matrix:");
        for(int i=0; i<m1; i++)
        {
            for(int j=0;j<n1;j++)
            {
                matrix2[i][j] = read.nextInt();
            }
        }
        System.out.println("First matrix is: ");
        for(int i=0; i<m1; i++)
        {
            for(int j=0;j<n1;j++)
            {
                System.out.print(matrix1[i][j] +"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Second matrix is: ");
        for(int i=0; i<m2; i++)
        {
            for(int j=0;j<n2;j++)
            {
                System.out.print(matrix2[i][j] +"\t");
            }
            System.out.print("\n");
        }
     
        int add[][] = new int[m1][n1];
        if(m1 == m2 && n1 == n2)
        {
            for(int i=0; i<m1; i++)
            {
                for(int j=0; j<n1; j++)
                {
                    add[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Matrix Addition is: ");
            for(int i=0; i<m1; i++)
            {
                for(int j=0;j<n1;j++)
                {
                    System.out.print(add[i][j] +"\t");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("Addition not possible.");
        }
    }
}
