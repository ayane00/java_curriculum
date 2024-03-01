package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	/*---------------------
	 * helloメソッドを作成
	 ----------------------*/
	public static void hello(String str, int num1) {

		// 結果を出力する
		System.out.println(str + " " + num1 + "\r");
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	/*------------------
	 * calcメソッドを作成
	 ------------------*/
	public static void calc(int num2) {

		// 結果を出力する
		System.out.println(num2 * num2 + "\r");
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	/*--------------------
	 * array1メソッドを作成
	 --------------------*/
	public static void array1(int[] a) {

		// 引数の配列の要素分繰り返す
		for (int arrayNum : a) {

			// 結果を出力する
			System.out.print(arrayNum + " ");
		}
		// 問いと問いの間に改行を入れる
		System.out.println("\r");
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	/*------------------------------
	 * calcメソッド（オーバーロード）を作成
	 ------------------------------*/
	public static void calc(double dNum1, double dNum2) {

		// 結果を出力する
		System.out.println(dNum1 + dNum2 + "\r");
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	/*-------------------
	 * array2メソッドを作成
	 ---------------------*/
	public static int[] array2(int i) {

		// 数字を格納する配列をrndArrayとする
		int[] rndArray = new int[i];

		// ランダムな値を生成する
		Random rnd = new Random();

		// 引数に入れられた値の分繰り返す
		for (int j = 0; j < i; j++) {

			// 1~100をランダムに出す
			int num3 = rnd.nextInt(100) + 1;

			// 結果を出力する
			System.out.print(num3 + " ");

			// 値を配列rndArrayに格納する
			rndArray[j] = num3;
		}

		// 問いと問いの間に改行を入れる
		System.out.println("\n");

		// 配列rndArrayを返す
		return rndArray;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	/*-------------------
	 * avgメソッドを作成する
	 --------------------*/
	public static double avg(int[] a) {

		// 合計値sumを初期化する
		double sum = 0.0;

		double average = 0.0;

		// 引数に入れられた配列の要素数分繰り返す
		for (int avgArray : a) {

			// 自己代入し、sumを求める
			sum += avgArray;

		}

		// 平均値averageを求める
		return average = sum / a.length;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	/*-------------------------
	 * isEnabledメソッドを作成する
	 --------------------------*/
	public static void over(double avgNum) {

		boolean isOver50 = avgNum >= 50;

		// 引数が50以上の時
		System.out.println(isOver50);

	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		// Q1のメソッド呼び出し
		hello("Hellow JavaSE", 11);

		// Q2のメソッド呼び出し
		calc(2);

		// Q3のメソッド呼び出し
		int[] q3Num = { 1, 2, 3, 4 };
		array1(q3Num);

		// Q4のメソッド呼び出し
		calc(1.5, 2.1);

		// Q5のメソッド呼び出し
		int[] numArray = array2(6);

		// Q6のメソッド呼び出し
		double numAvg = avg(numArray);

		// 結果を出力する（小数点第2位まで）
		System.out.println(String.format("%.2f", numAvg));
		// Q7のメソッド呼び出し
		over(numAvg);

	}
}