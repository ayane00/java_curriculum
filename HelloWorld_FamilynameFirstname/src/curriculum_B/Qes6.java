package curriculum_B;

// Scannerクラスをインポート
import java.util.Scanner;

// Rondamクラスをインポート
import java.util.Random;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// コンソールに商品を入力できるようにする
		Scanner scanner = new Scanner(System.in);

		// 入力内容を表示する
		String productName = scanner.nextLine();

		// Scannerクラスの利用終了
		scanner.close();

		// 入力内容を「、」で値ごとに区切る
		String[] products = productName.split("、");

		// ランダムな値を出すための宣言
		Random rnd = new Random();

		// テレビの台数
		int tvNum = rnd.nextInt(12);

		// ディスプレイの台数
		int dpNum = 11 - tvNum;

		// 入力内容の要素の個数分繰り返す
		for (String product : products) {

			// 0~11までのランダムな値を出す
			int num = rnd.nextInt(12);

			// 各条件ごとの内容を出力する
			switch (product) {
			case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器":
				System.out.println(product + "の残り台数は" + num + "台です\r\n");
				break;
			case "テレビ", "ディスプレイ":
				String productnum = (product.equals("ディスプレイ")) ? product + "の残り台数は" + dpNum + "台です\r\n"
						: product + "の残り台数は" + tvNum + "台です\r\n";
				System.out.println(productnum);
				break;
			default:
				System.out.println("『 " + product + " 』は指定の商品ではありません\r\n");
			}

		}

	}

}
