package main_curriculum1_25;

//　サブクラスをインポートする
import curriculum1_25.Status_child;

//Randomクラスをインポート
import java.util.Random;

//Scannerクラスをインポート
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 名前のコンソール入力だできるようにする
		Scanner scanner = new Scanner(System.in);

		// 入力内容の表示
		String userName = scanner.nextLine();

		// Scannerクラス終了
		scanner.close();

		// ランダムな値を取得するための宣言
		Random rnd = new Random();

		// インスタンスの生成
		Status_child child = new Status_child(userName);
		Status_child child_values = new Status_child();

		// セッターを使い、各項目の値をランダムな3桁の値に設定する
		child_values.setHp(rnd.nextInt(900) + 100);
		child_values.setMp(rnd.nextInt(900) + 100);
		child_values.setAttack(rnd.nextInt(900) + 100);
		child_values.setQuick(rnd.nextInt(900) + 100);
		child_values.setDefense(rnd.nextInt(900) + 100);

		// 各内容をコンソール出力する
		System.out.println("こんにちは「　" + child.getName() + "　」さん");
		System.out.println("ステータス");
		System.out.println("HP ： " + child_values.getHp());
		System.out.println("MP ： " + child_values.getMp());
		System.out.println("攻撃力　：　" + child_values.getAttack());
		System.out.println("素早さ　：　" + child_values.getQuick());
		System.out.println("防御力　：　" + child_values.getDefense());
		System.out.println("\rさあ冒険に出かけよう！");
	}

}
