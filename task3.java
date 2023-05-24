import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n <= 20):");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
        
        int[] seq1 = {1, 2, 3, 3, 2, 1};
        int[] seq2 = {1, 2, 3, 5, 3, 2, 1};
        
        for (int i = 0; i < n; i++) {
            if (Arrays.equals(matrix[i], seq1) || Arrays.equals(matrix[i], seq2)) {
                System.out.println("The row number that forms a symmetric sequence: " + (i+1));
            }
        }
    }
}
