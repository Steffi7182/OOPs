import java.util.Scanner;

public class SymmetricMatrix{
    public static void main(String[] arg){
        System.out.println(" Steffi Antony\n Roll No: 54\n Date: 14-02-2024\n Program title: Symmetric or not\n");

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the rows and cols of the matrix : ");
        int rows = read.nextInt();
        int cols = read.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements : ");
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = read.nextInt();
            }
        }
        System.out.println("\nMatrix is");
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
        if(rows == cols){
            int flag=0;
            for(int i=0; i<rows; i++){
                for(int j=0;j<cols;j++){
                    if(matrix[i][j] != matrix[j][i]){
                        flag=1;
                        break;
                    }
                }
                if(flag == 1) break;
            }
            if(flag == 0){
                System.out.println("\nThe matrix is a Symmetric matrix.");
            } else {
                System.out.println("\nThe matrix is not a Symmetric matrix.");
            }
        } else {
            System.out.println("\nThe matrix is not a Symmetric matrix.");
        }
    }
}
