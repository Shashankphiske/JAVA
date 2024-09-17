import java.util.Scanner;

public class TicTacToe {
    static int count = 0;
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        printBoard(board);

        while (true) {
            playerMove(board);
            printBoard(board);
            
            if (isGameOver(board)) {
                break;
            }

            computerMove(board);
            printBoard(board);
            System.out.println(count);
            if (isGameOver(board)) {
                break;
            }
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static void playerMove(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int col = 0;
        int move;
        
        System.out.print("Enter your place for move : ");
        move = scanner.nextInt();
        switch(move)
        {
            case 1:
                row = 0;
                col = 0;
                break;
            case 2:
                row = 0;
                col = 1;
                break;
            case 3:
                row = 0;
                col = 2;
                break;
            case 4:
                row = 1;
                col = 0;
                break;
            case 5:
                row = 1;
                col = 1;
                break;
            case 6:
                row = 1;
                col = 2;
                break;
            case 7:
                row = 2;
                col = 0;
                break;
            case 8:
                row = 2;
                col = 1;
                break;
            case 9:
                row = 2;
                col = 2;
                break;
            default :
                System.out.println("Please enter a valid input ");
        }
        
        if(board[row][col] == ' ')
        {
            board[row][col] = 'X';
        }
        else
        {
            playerMove(board);  
        }
    }

    private static void computerMove(char[][] board) {
        int[] bestMove = minimax(board, 'O');
        board[bestMove[0]][bestMove[1]] = 'O';
    }


    private static boolean isGameOver(char[][] board) {
        return hasContestantWon(board, 'X') || hasContestantWon(board, 'O') || isBoardFull(board);
    }

    private static boolean hasContestantWon(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    private static int[] minimax(char[][] board, char player) {
        int[] bestMove = {-1, -1};
        int bestScore;
        if (player == 'O')
        {   bestScore = Integer.MIN_VALUE;
            }
        else{
            bestScore = Integer.MAX_VALUE;
        }
        int alpha = Integer.MIN_VALUE;
        int beta = Integer.MAX_VALUE;
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;
                    
                    int score = minimaxHelper(board, 0, false, alpha, beta);
                    board[i][j] = ' ';
                    if ((player == 'O' && score > bestScore) || (player == 'X' && score < bestScore)) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
    
                    if (player == 'O') {
                        alpha = Math.max(alpha, bestScore);
                    } else {
                        beta = Math.min(beta, bestScore);
                    }
    
                    if (alpha >= beta) {
                        break;
                    }
                }
            }
        }
    
        return bestMove;
    }
    
    private static int minimaxHelper(char[][] board, int depth, boolean isMaximizing, int alpha, int beta) {
        if (isGameOver(board)) {
            return evaluate(board);
        }
    
        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'O';
                        count += 1;
                        
                        bestScore = Math.max(bestScore, minimaxHelper(board, depth + 1, false, alpha, beta));
                        board[i][j] = ' ';
                        if(bestScore > 0)
                        {
                            return bestScore;
                        }
                
                        alpha = Math.max(alpha, bestScore);
                        if (alpha >= beta) {
                            break;
                        }
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'X';
                        count += 1;
                        
                        bestScore = Math.min(bestScore, minimaxHelper(board, depth + 1, true, alpha, beta));
                        board[i][j] = ' ';
                        beta = Math.min(beta, bestScore);
                        if(bestScore < 0)
                        {
                            return bestScore;
                        }
                        if (alpha >= beta) {
                            break;
                        }
                    }
                }
            }
            return bestScore;
        }
    }
    
    private static int evaluate(char[][] board) {
        if (hasContestantWon(board, 'O')) {
            return 1;
        } else if (hasContestantWon(board, 'X')) {
            return -1;
        } else {
            return 0;
        }
    }
}