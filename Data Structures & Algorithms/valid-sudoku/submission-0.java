class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRow(board) && checkColumn(board) && checkBox(board);
    }

    public boolean checkRow(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (!set.add(board[i][j])) return false;
            }
        }
        return true;
    }

    public boolean checkColumn(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                if (!set.add(board[j][i])) return false;
            }
        }
        return true;
    }

    public boolean checkBox(char[][] board) {
        for (int square = 0; square < 9; square++) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row  = (square / 3) * 3 + i;
                    int  column = (square % 3) * 3 + j;

                    if (board[row][column] == '.') continue;
                    if (!set.add(board[row][column])) return false;
                }
            }
        }
        return true;
    }
}
