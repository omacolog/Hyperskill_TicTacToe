import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner  = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i =0; i<size; i++){
            array[i] = scanner.nextInt();
        }

        boolean checkOrdered = true;

        for(int j = 0; j<size-1; j++){
            if(array[j] > array[j+1]){
                checkOrdered = false;
                break;
            }
        }

        System.out.println(checkOrdered);

        scanner.close();

    }
}