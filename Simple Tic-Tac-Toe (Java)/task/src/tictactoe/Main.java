package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int moveCount = 0;
        String gridStartValue = "         "; // Empty Game Area - 9 spaces
        char[][] grid = createGrid(gridStartValue);
        printGrid(grid);

        while (true) {
            makeMove(moveCount, scanner, grid);
            moveCount++;
            printGrid(grid);
            String gameState = checkGameState(grid);
            if (!gameState.equals("Game not finished")) {
                System.out.println(gameState);
                break;
            }
        }
    }

    private static char[][] createGrid(String input) {
        char[][] grid = new char[3][3];
        for (int i = 0; i < 9; i++) {
            grid[i / 3][i % 3] = input.charAt(i);
        }
        return grid;
    }

    private static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static void printGrid(char[][] grid) {
        System.out.println("---------");
        for (char[] row : grid) {
            System.out.print("| ");
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static String checkGameState(char[][] grid) {
        boolean xWins = checkWinner(grid, 'X');
        boolean oWins = checkWinner(grid, 'O');

        if (xWins) {
            return "X wins";
        }
        if (oWins) {
            return "O wins";
        }

        boolean draw = true;
        for (char[] row : grid) {
            for (char cell : row) {
                if (cell == ' ') {
                    draw = false;
                    break;
                }
            }
        }

        if (draw) {
            return "Draw";
        }

        return "Game not finished";
    }

    private static boolean checkWinner(char[][] grid, char player) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) {
                return true;
            }
            if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) {
                return true;
            }
        }

        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
            return true;
        }
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
            return true;
        }
        return false;
    }

    private static void makeMove(int moveCount, Scanner scanner, char[][] grid) {
        while (true) {
            System.out.print("> ");
            String[] input = scanner.nextLine().split(" ");
            if (input.length != 2 || !isNumeric(input[0]) || !isNumeric(input[1])) {
                System.out.println("You should enter numbers!");
                continue;
            }

            int row = Integer.parseInt(input[0]) - 1;
            int col = Integer.parseInt(input[1]) - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (grid[row][col] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            grid[row][col] = moveCount % 2 == 0 ? 'X' : 'O';
            break;
        }
    }

}
