public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += matrix[i][i]; // main diagonal
            if(i != n - 1 - i) sum += matrix[i][n - 1 - i]; // secondary diagonal
        }
        System.out.println("Sum of diagonals: " + sum);
    }
}
