package Leetcode_Problems;

import java.util.HashMap;
import java.util.Map;

public class Leetcode36 {
        public boolean isValidSudoku(char[][] board) {
            Map<Character, Integer>[][] m = new HashMap[3][3];
            Map<Character, Integer>[] row = new HashMap[9];
            Map<Character, Integer>[] col = new HashMap[9];
            int[] index = {0,0,0,1,1,1,2,2,2};
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] != '.') {
                        if (row[i] == null) {
                            row[i] = new HashMap<>();
                        }
                        if (row[i].containsKey(board[i][j])) {
                            row[i].put(board[i][j], row[i].get(board[i][j]) + 1);
                        } else {
                            row[i].put(board[i][j], 1);
                        }
                        if (row[i].get(board[i][j]) == 2) {
                            return false;
                        }

                        if (col[j] == null) {
                            col[j] = new HashMap<>();
                        }
                        if (col[j].containsKey(board[i][j])) {
                            col[j].put(board[i][j], col[j].get(board[i][j]) + 1);
                        } else {
                            col[j].put(board[i][j], 1);
                        }
                        if (col[j].get(board[i][j]) == 2) {
                            return false;
                        }

                        int k = index[i];
                        int l = index[j];
                        if (m[k][l] == null) {
                            m[k][l] = new HashMap<>();
                        }
                        if (m[k][l].containsKey(board[i][j])) {
                            m[k][l].put(board[i][j], m[k][l].get(board[i][j]) + 1);
                        } else {
                            m[k][l].put(board[i][j], 1);
                        }
                        if (m[k][l].get(board[i][j]) == 2) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
}
