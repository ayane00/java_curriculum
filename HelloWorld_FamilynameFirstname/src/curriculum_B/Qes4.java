package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*--------------------------------
		 * [概要]for文を利用して九九を表示する
		 --------------------------------*/
		// 9になるまで繰り返す
		for (int i = 1; i <= 9; i++) {

			// 9になるまで繰り返す
			for (int j = 1; j <= 9; j++) {

				// 0埋めをし、計算結果を出力する
				System.out.print(String.format(" %02d ", i) + "　＊　" + String.format(" %02d ", j) + " = "
						+ String.format(" %02d ", (i * j)));

				if (j < 9) {
					// jの値が9未満の時に||を付ける
					System.out.print("||");

					// 上記以外の時は何も付けない
				} else {
					System.out.println();
				}
			}
		}
	}
}
