import java.util.Scanner;

public class Main{

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printPattern(n);
    }
}