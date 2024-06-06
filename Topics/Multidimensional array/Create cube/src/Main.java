class ArrayOperations {
    public static int[][][] createCube() {
        //write here
        int[][][] cube = new int[3][3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cube[i][j][k] = j*3 + k;
                }
            }
        }
        return cube;
    }
}
