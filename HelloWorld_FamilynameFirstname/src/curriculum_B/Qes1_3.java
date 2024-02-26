package curriculum_B;

// Scannerクラスをインポート
import java.util.Scanner;

// ava.util.regex パッケージに含まれるすべてのクラスをインポート
import java.util.regex.*;

// Randomクラスをインポート
import java.util.Random;


public class Qes1_3 {

	// 半角英数字の正規表現
	private static final String HANNKAKU = "^[0-9a-zA-Z]+$";


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*------------------------------------------
		 *  [概要]　ログイン時の入力チェックシステム（Q1-Q2）
		 ------------------------------------------*/

		// コンソールにユーザー名を入力できるようにする
		Scanner scanner = new Scanner(System.in);

		// 入力内容の表示
		String userName = scanner.nextLine();

		//Scannerクラスの利用終了
		scanner.close();

		//半角英数字のパターンを用意する
		Pattern p1 = Pattern.compile(HANNKAKU);

		//userNameの内容が半角英数字とマッチするかを調べる
		Matcher m = p1.matcher(userName);

		// ユーザー名が10文字より大きい時の処理
		if(userName.length() > 10) {
			System.out.println("「名前を10文字以内に入力してください」");

		// ユーザー名が0文字またはnullの時の処理
		} else if(userName.length() <= 0 || userName == null) {
			System.out.println("「名前を入力してください」");

		//　ユーザー名が半角英数字でない時の処理
		} else if (!m.matches()){
			System.out.println("「半角英数字のみで名前を入力してください」");

		// ユーザー名が正常な値の時の処理
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");

			/*---------------------------------------------
			 * [概要] ユーザー名が正常の場合じゃんけんシステム起動
		 　　　---------------------------------------------*/
			//　じゃんけんの手を定義する
			int g = 0;
			int c = 1;
			int p = 2;

			//　自分の手
			int myHand = 0;

			//　相手の手
			int yourHand = 0;

			//　相手の手を宣言する
			String yourHandg = "相手の手は「グー」\r\n";
			String yourHandc = "相手の手は「チョキ」\r\n";
			String yourHandp = "相手の手は「パー」\r\n";

			//　じゃんけんの回数を数える
			int count = 0;

			// じゃんけんの手をランダムで出すための宣言
			Random rnd = new Random();

			// じゃんけんに勝つまで繰り返す
			while(true) {

				// 自分のじゃんけんの手を決める
				myHand = rnd.nextInt(3);

				// 相手のじゃんけんの手を決める
				yourHand = rnd.nextInt(3);

				//カウントする
				count++;

				// 自分の手がグーの時
				if(myHand == g) {
					System.out.println(userName + "の手は「グー」");

					// 勝った場合
					if(yourHand == c) {

						//相手の手を表示
						System.out.println(yourHandc);

						//
						System.out.println("やるやん。\r\n次は俺にリベンジさせて\r\n");

						// 処理を終了する
						break;

					// パーに負けた場合
					} else if(yourHand == p) {
						// 相手の手を表示
						System.out.println(yourHandp);

						//　コメント表示
						System.out.println("俺の勝ち！\r\nなんで負けたか、明日までに考えといてください。\r\nそしたら何かが見えてくるはずです\r\n");

					// あいこの場合
					} else {

						//　相手の手を表示
						System.out.println(yourHandg);

						//　コメント表示
						System.out.println("DRAW あいこ もう一回しましょう！\r\n");
					}

				// 自分の手がチョキの時
				} else if(myHand == c) {
					System.out.println(userName + "の手は「チョキ」");

					// 勝った場合
					if(yourHand == p) {

						//　相手の手を表示
						System.out.println(yourHandp);

						//　コメント表示
						System.out.println("やるやん。\r\n次は俺にリベンジさせて\r\n");

						//　処理を終了する
						break;

					// グーに負けた場合
					} else if(yourHand == g) {

						//　相手の手を表示
						System.out.println(yourHandg);

						//　コメント表示
						System.out.println("俺の勝ち！\r\n負けは次につながるチャンスです！\r\nネバーギブアップ！\r\n");

					//　あいこの場合
					} else {

						//　相手の手を表示
						System.out.println(yourHandc);

						//　コメント表示
						System.out.println("DRAW あいこ もう一回しましょう！\r\n");
					}


				// 自分の手がパーの時
				} else if(myHand == p) {
					System.out.println(userName + "の手は「パー」");

					// 勝った場合
					if(yourHand == g) {

						//　相手の手を表示
						System.out.println(yourHandg);

						//　コメント表示
						System.out.println("やるやん。\r\n次は俺にリベンジさせて\r\n");

						//　処理を終了する
						break;

					// チョキに負けた場合
					} else if(yourHand == c) {

						//　相手の手を表示
						System.out.println(yourHandc);

						//　コメント表示
						System.out.println("俺の勝ち！\r\nたかがじゃんけん、そう思ってないですか？\r\nそれやったら次も、俺が勝ちますよ\r\n");

					//　あいこの場合
					} else {

						//　相手の手を表示
						System.out.println(yourHandp);

						//　コメント表示
						System.out.println("DRAW あいこ もう一回しましょう！\r\n");
					}

				}
			}
			//　勝つまでの回数を出力
			System.out.println("勝つまでかかった合計回数" + count + "回です");
		};
	}
}
