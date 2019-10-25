package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean horizontalCheck(Character XO) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == XO) && (board[i][1] == XO) && (board[i][2] == XO)) {
                return true;
            }
        }
        return false;
    }

    public Boolean verticalCheck(Character XO) {
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] == XO) && (board[1][i] == XO) && (board[2][i] == XO)) {
                return true;
            }
        }
        return false;
    }

    public Boolean diagonalCheck(Character XO) {
        if (((board[0][0] == XO) && (board[1][1] == XO) && (board[2][2] == XO))
                || ((board[0][2] == XO) & (board[1][1] == XO) & (board[2][0] == XO))) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfX() {

        if (horizontalCheck('X') || verticalCheck('X') || diagonalCheck('X')) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if (horizontalCheck('O') || verticalCheck('O') || diagonalCheck('O')) {
            return true;
        }
        return false;
    }


    public Boolean isTie() {
        if (!isInFavorOfO() && !isInFavorOfX()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfO()) {
            return "O";
        }
        if (isInFavorOfX()) {
            return "X";
        }
        return "";
    }

}
