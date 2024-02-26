package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*--------------------------------
		 * [概要]for文を利用して九九を表示する
		 --------------------------------*/
		// 9になるまで繰り返す
		for (int i = 1; i <= 9; i++) {

			// 20になるまで繰り返す
			for (int j = 1; j <= 20; j++) {
				System.out.print(String.format(" %03d ", j) + " ＊ " + String.format(" %03d ", i) + " = "
						+ String.format(" %03d ", (i * j)));

				if (j < 20) {
					// jの値が20未満の時に||を付ける
					System.out.print("||");

					// 上記以外の時は何も付けない
				} else {
					System.out.println();
				}
			}
		}

	}

}
