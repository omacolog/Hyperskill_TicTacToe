import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] list = new int[size];

        for(var i = 0; i< size; i++){
            list[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();
        int sum = 0;

        for(int j = 0; j<size; j++){
            if(list[j] > number){
                sum += list[j];
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}