import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args){
        /*
         * Author: Akande Victor
         * Matric number: EU210102-2535
         * 
         * Add two matrices of (n) number of elements
         * 
         * Return: Array(Integer)  
         */
        int n, r, c, j;
        Scanner enter_number = new Scanner(System.in);
        System.out.println("How many rows are in the matrix? ");
        r = enter_number.nextInt();
        System.out.println("How many columns are in the matrix? ");
        c = enter_number.nextInt();
        n = r * c;
        int[] first_matrix = new int[n];  // AKANDE VICTOR ADEOLA
        int[] second_matrix = new int[n];
        System.out.println("Enter elements of the first matrix? ");
        for (int i = 0; i < n; i++)
            first_matrix[i] = enter_number.nextInt();
        System.out.println("Matrix A");
        System.out.println();
        j = 0;
        for (int i = 0; i < r; i++){
            for (int k = j ; k < (j + c); k++){
                System.out.print(first_matrix[k] + " ");
            }
            System.out.println();
            j = j + c;
        }
        System.out.println("Enter elements of the second matrix? ");
        for (int i = 0; i < n; i++)
            second_matrix[i] = enter_number.nextInt();
        System.out.println("Matrix B");
        System.out.println();
        j = 0;
        for (int i = 0; i < r; i++){
            for (int k = j ; k < (j + c); k++)
                System.out.print(second_matrix[k] + " ");
            System.out.println();
            j = j + c;
        }
        int[] matrix_sum = new int[n];
        for (int i = 0; i < n; i++)
            matrix_sum[i] = first_matrix[i] + second_matrix[i];
        System.out.println("The sum is:");
        // Close scanner object
        enter_number.close();
        j = 0;
        for (int i = 0; i < r; i++){
            for (int k = j ; k < (j + c); k++)
                System.out.print(matrix_sum[k] + " ");
            System.out.println();
            j = j + c;
        }
    }
}
