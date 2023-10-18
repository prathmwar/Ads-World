import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<List<String>> NQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        sol(res, board, 0);
        return res;
    }

    private void sol(List<List<String>> res, char[][] cb, int row) {
        if (row == cb.length) {
            res.add(qPos(cb));
            return;
        }

        for (int col = 0; col < cb.length; col++) {
            if (isP(cb, row, col)) {
                cb[row][col] = 'Q';
                sol(res, cb, row + 1);
                cb[row][col] = '.';
            }
        }
    }

    private boolean isP(char[][] cb, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (cb[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (cb[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < cb.length; i--, j++) {
            if (cb[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private List<String> qPos(char[][] cb) {
        List<String> soln = new ArrayList<>();
        for (int i = 0; i < cb.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < cb[i].length; j++) {
                if (cb[i][j] == 'Q') {
                    row.append(j + 1); // Place the column number (1-based) in the box.
                } else {
                    row.append('.');
                }
            }
            soln.add(row.toString());
        }
        return soln;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

        Main nQueens = new Main();
        List<List<String>> ans = nQueens.NQueens(n);

        for (List<String> soln : ans) {
            for (String row : soln) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
