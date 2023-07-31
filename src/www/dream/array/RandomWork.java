package www.dream.array;

public class RandomWork {
	/**
	 * 랜덤으로 지난 경로 표시하기
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 칸 크기
		final int ROOT = 7;
		boolean[][] board = new boolean[ROOT][ROOT];
		int curRow = ROOT / 2;
		int curCol = ROOT / 2;
		board[curRow][curCol] = true;
		final int TOT_STEP = ROOT * ROOT / 4;
		int steps = 0;
		displayBoard(board);
		for (; steps < TOT_STEP; steps++) {
			int direction = (int) (Math.random() * 4);
			if (curRow > 0 && direction == 0) {
				curRow--; // 북
			} else if (curRow <= ROOT - 1 && direction == 1) {
				curRow++; // 남
			} else if (curCol > 0 && direction == 2) {
				curCol--; // 서
			} else if (curCol <= ROOT - 1 && direction == 3) {
				curCol++; // 동
			}
			board[curRow][curCol] = true;
			displayBoard(board);
		}

		// 보드 만들기

	}

	private static void displayBoard(boolean[][] board) {
		for (boolean[] boa : board) {
			for (boolean bo : boa) {
				if (bo) {
					System.out.print("#");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println("==============");
	}

}
