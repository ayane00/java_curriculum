package curriculum_B;

//Scannerクラスをインポート
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// コンソールに値を入力できるようにする
		Scanner scanner = new Scanner(System.in);

		// 指示文の出力
		System.out.print("生徒の人数を入力してください（2以上）：");

		// 入力内容の表示（生徒数）
		int student = scanner.nextInt();

		// do-whileの繰り返しに利用
		int num = 1;

		// 各生徒の点数をまとめる多次元配列をscoreとする
		int[][] score = new int[student][4];

		// student（入力）の値になるまで繰り返す
		do {
			// 英語の点数の入力指示
			System.out.print(num + "人目の『英語』の点数を入力してください：");

			// 入力内容の表示（英語）
			int english = scanner.nextInt();

			// 数学の点数の入力指示
			System.out.print(num + "人目の『数学』の点数を入力してください：");

			// 入力内容の表示（数学）
			int math = scanner.nextInt();

			// 理科の点数の入力指示
			System.out.print(num + "人目の『理科』の点数を入力してください：");

			// 入力内容の表示（理科）
			int science = scanner.nextInt();

			// 社会の点数の入力指示
			System.out.print(num + "人目の『社会』の点数を入力してください：");

			// 入力内容の表示（社会）
			int socialStudies = scanner.nextInt();

			// 改行を入れる
			System.out.println("\n");

			// 配列scoreに各教科の点数を格納する
			score[num - 1][0] = english;
			score[num - 1][1] = math;
			score[num - 1][2] = science;
			score[num - 1][3] = socialStudies;

			// カウントする
			num++;

		} while (num <= student);

		// Scannerクラスの利用終了
		scanner.close();

		// ある生徒の合計点の初期値を設定する
		double sum = 0.0;

		// ある生徒の平均点の初期値を設定する
		double avg = 0.0;

		// 全生徒の平均点の初期値を設定する
		double allAvg = 0.0;

		// 教科の数の初期値を設定する
		double subjectNum = 0.0;

		// 全生徒の英語の合計点の初期値を設定する
		double sumEnglish = 0.0;

		// 全生徒の数学の合計点の初期値を設定する
		double sumMath = 0.0;

		// 全生徒の理科の合計点の初期値を設定する
		double sumScience = 0.0;

		// 全生徒の社会の合計点の初期値を設定する
		double sumSocialstudies = 0.0;

		// 生徒の人数分繰り返す
		for (int i = 0; i < score.length; i++) {

			// 合計点を初期化する
			sum = 0.0;

			// 全生徒の各教科の点数を合計する
			sumEnglish += score[i][0];
			sumMath += score[i][1];
			sumScience += score[i][2];
			sumSocialstudies += score[i][3];

			// 教科数分繰り返す
			for (int j = 0; j < score[i].length; j++) {

				// 生徒ごとに合計点を求める
				sum += score[i][j];

				// 生徒ごとの平均点を求める
				avg = sum / score[i].length;

				// 教科数をカウントする
				subjectNum++;
			}

			// 全生徒の全教科の合計点
			allAvg += sum;

			System.out.println(i + 1 + "人目の平均点は" + String.format("%.2f", avg) + "点です。");
		}

		// 全生徒の各教科の平均点を小数点第2位まで出力
		System.out.println("\n英語の平均点は" + String.format("%.2f", sumEnglish / student) + "点です。");
		System.out.println("数学の平均点は" + String.format("%.2f", sumMath / student) + "点です。");
		System.out.println("理科の平均点は" + String.format("%.2f", sumScience / student) + "点です。");
		System.out.println("社会の平均点は" + String.format("%.2f", sumSocialstudies / student) + "点です。");

		// 全体の平均点を小数点第2位まで出力
		System.out.println("全体の平均点は" + String.format("%.2f", allAvg / subjectNum) + "点です。");
	}

}
