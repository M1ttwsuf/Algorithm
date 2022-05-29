package LeetCode.gameOfLife;

public  class Solution {
    public void gameOfLife(int[][] board) {
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
        int n = board.length, m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int lives = 0;

                for (int k = 0; k < 8; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];

                    if (x < 0 || x >= n || y < 0 || y >= m) continue;
                    if (board[x][y] == 1 || board[x][y] == 2) lives++;
                }

                if (board[i][j] == 0 && lives == 3) board[i][j] = 3;
                if (board[i][j] == 1 && (lives < 2 || lives > 3)) board[i][j] = 2;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] %= 2;
            }
        }
    }

    public static void main(String[] args) {

    }
}