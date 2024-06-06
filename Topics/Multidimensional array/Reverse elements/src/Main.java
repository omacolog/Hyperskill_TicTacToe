class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int[] row : twoDimArray) {
            // Reverse the elements of the current row
            for (int j = 0, k = row.length - 1; j < k; j++, k--) {
                int temp = row[j];
                row[j] = row[k];
                row[k] = temp;
            }
        }
    }
}