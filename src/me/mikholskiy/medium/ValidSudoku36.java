package me.mikholskiy.medium;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
5 3 . | . 7 . | . . .
6 . . | 1 9 5 | . . .
. 9 8 | . . . | . 6 .
------+-------+------
8 . . | . 6 . | . . 3
4 . . | 8 . 3 | . . 1
7 . . | . 2 . | . . 6
------+-------+------
. 6 . | . . . | 2 8 .
. . . | 4 1 9 | . . 5
. . . | . 8 . | . 7 9
*/

/*
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9

8 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 8
*/

public class ValidSudoku36 {
	public boolean isValidSudoku(char[][] board) {
		Set<Character> symbols = new HashSet<>();

		for (char[] row : board) {
			for (int i = 0; i < 9; ++i) {
				if (symbols.contains(row[i]) && row[i] != '.') {
					return false;
				} else {
					symbols.add(row[i]);
				}
			}
			symbols.clear();
		}

		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				if (symbols.contains(board[j][i]) && board[j][i] != '.') {
					return false;
				} else {
					symbols.add(board[j][i]);
				}
			}
			symbols.clear();
		}

		for (int k = 0; k <= 6; k += 3) {
			for (int m = 0; m <= 6; m += 3) {
				for (int i = k; i < k + 3; ++i) {
					for (int j = m; j < m + 3; ++j) {
						if (symbols.contains(board[i][j]) && board[i][j] != '.') {
							return false;
						} else {
							symbols.add(board[i][j]);
						}
					}
				}
				symbols.clear();
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char[][] board = new char[9][9];
		for (int i = 0; i < 9; ++i) {
			for (int j = 0; j < 9; ++j) {
				board[i][j] = s.next().charAt(0);
			}
		}

		System.out.println(new ValidSudoku36().isValidSudoku(board));
	}
}
