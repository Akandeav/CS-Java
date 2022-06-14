import java.util.Scanner;
public class MatrixMult {
    public static void main (String[] args){
        // AKANDE VICTOR ADEOLA
        int a_row;
        int a_col;
        int b_row;
        int b_col;

        Scanner enter_number = new Scanner(System.in);
        System.out.println("Number of rows in matrix a: ");
        a_row = enter_number.nextInt();
        System.out.println("Number of columns in matrix a: ");
        a_col = enter_number.nextInt();

        System.out.println("Number of rows in matrix b: ");
        b_row = enter_number.nextInt();
        System.out.println("Number of columns in matrix b: ");
        b_col = enter_number.nextInt();

        if (a_col == b_row){
            System.out.println("Enter Matrix A values");
            int[][] first_matrix = new int[a_row][a_col];
            for (int i = 0; i < a_row; i++){
                for (int j = 0; j < a_col; j++){
                    String out = "Enter row " + i + " Col: " + j;
                    System.out.println(out);
                    first_matrix[i][j] = enter_number.nextInt();
                }
            }
            System.out.println();
            System.out.println("Enter Matrix B values");
            int[][] second_matrix = new int[b_row][b_col];
            for (int i = 0; i < a_row; i++){
                for (int j = 0; j < a_col; j++){
                    String out = "Enter row " + i + " Col: " + j;
                    System.out.println(out);
                    second_matrix[i][j] = enter_number.nextInt();
                }
            }
            enter_number.close();
            int[][] matrix_product = new int[a_row][b_col];
            for (int i = 0; i < a_row; i++) {
                for (int j = 0; j < b_col; j++) {
                    for (int k = 0; k < b_row; k++)
                        matrix_product[i][j] += first_matrix[i][k] * second_matrix[k][j];
                }
            }
            System.out.println();
            System.out.println("Matrix A");
            System.out.println();
            for (int i = 0; i < a_row; i++){
                for (int j = 0; j < a_col; j++){
                    System.out.print(first_matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Matrix B");
            System.out.println();
            for (int i = 0; i < b_row; i++){
                for (int j = 0; j < b_col; j++){
                    System.out.print(second_matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("The product of Matrix A and B is");
            System.out.println();
            for (int i = 0; i < a_row; i++){
                for (int j = 0; j < b_col; j++){
                    System.out.print(matrix_product[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Matrix multiplication is not Possible");
        }
        
    }
    
}
