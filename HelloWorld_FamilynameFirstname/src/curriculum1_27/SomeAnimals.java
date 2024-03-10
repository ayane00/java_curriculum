package curriculum1_27;

import java.util.Scanner;

public class SomeAnimals {
	public static void main(String[] args) {

		// コンソール入力を促すメッセージ表示
		System.out.println("コンソールに文字を入力してください");

		// 標準入力からテキストを受け取るScannerを作成
		Scanner scanner = new Scanner(System.in);

		// 入力内容のを受け取る
		String input = scanner.nextLine();

		// Scannerを終了する
		scanner.close();

		// 入力内容のを「,」ごとに区切り、配列animalDataを作成
		String[] animalData = input.split(",");

		// 配列animalDataの要素の数分繰り返す
		for (String data : animalData) {

			// 「：」ごとに区切り、配列animalinfoを作成
			String[] animalinfo = data.split(":");

			// 各内容を出力する
			System.out.println("動物名 ： " + animalinfo[0]);
			System.out.println("体長 ： " + animalinfo[1] + "m");
			System.out.println("速度 ： " + animalinfo[2] + "km/h");

			// switch文にて動物名ごとの学名を出力する
			switch (animalinfo[0]) {
			case "ライオン":
				System.out.println("学名 ： パンテラ レオ\r");
				break;
			case "ゾウ":
				System.out.println("学名 ： ロキソドンタ・サイクロティス\r");
				break;
			case "パンダ":
				System.out.println("学名 ： アイルロポダ・メラノレウカ\r");
				break;
			case "チンパンジー":
				System.out.println("学名 ： パン・トゥログロディテス\r");
				break;
			case "シマウマ":
				System.out.println("学名 ： チャップマンシマウマ\r");
				break;
			default:
				System.out.println("学名 ： 不明\r");

			}

		}

	}

}
