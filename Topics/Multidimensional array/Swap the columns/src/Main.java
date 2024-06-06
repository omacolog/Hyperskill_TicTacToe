import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int column1 = scanner.nextInt();
        int column2 = scanner.nextInt();

        swapColumns(matrix, n, column1, column2);
        printMatrix(matrix, n, m);
    }

    private static void swapColumns(int[][] matrix, int n, int column1, int column2) {
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = temp;
        }
    }

    private static void printMatrix(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}