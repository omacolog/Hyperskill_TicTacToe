import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] originalArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                originalArray[i][j] = scanner.nextInt();
            }
        }

        int[][] rotatedArray = rotateArray(originalArray);

        printArray(rotatedArray);
    }

    private static int[][] rotateArray(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        int[][] rotatedArray = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedArray[j][n - 1 - i] = array[i][j];
            }
        }
        return rotatedArray;
    }

    private static void printArray(int[][] array) {
        int n = array.length;
        int m = array[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
