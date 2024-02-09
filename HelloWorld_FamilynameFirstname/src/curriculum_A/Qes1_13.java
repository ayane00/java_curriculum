package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*------------------------
		 *　[概要]　問1.変数の宣言
		 ------------------------*/
		// バイト型の変数宣言
		byte byteData;

		// 短整数型の変数宣言
		short shortData;

		// 整数型の変数宣言
		int intData;

		// 長整数型の変数宣言
		long longData;

		// 単精度浮動小数点数型の変数宣言
		float floatData;

		// 倍精度浮動小数点数型の変数宣言
		double doubleData;

		// 文字型の変数宣言
		char charData;

		//　文字列型の変数宣言
		String stringData;

		//ブーリアン型の変数宣言
		boolean bool;


		/*-------------------------
		 * [概要]　問2.変数の初期化
		 --------------------------*/
		// バイト型の初期値を設定
		byteData = 0;

		//　短整数型の初期値を設定
		shortData = 0;

		//　整数型の初期値を設定
		intData = 0;

		//　長整数型の初期値を設定
		longData = 0;

		//　単精度浮動小数点数型の初期値を設定
		floatData = 0.0f;

		//　倍精度浮動小数点数型の初期値を設定
		doubleData = 0.0;

		//　文字型の初期値を設定
		charData = 'c';

		//　文字列型の初期値を設定
		stringData = "こんにちは";

		//　ブーリアン型の初期値を設定
		bool = false;


		/*--------------------------
		 *　[概要]　問3.変数に値を代入
		 ---------------------------*/
		// byteDataに10を代入
		byteData = 10;

		//　shortDataに100を代入
		shortData = 100;

		// intDataに1000を代入
		intData = 1000;

		// longDataに10000を代入
		longData = 10000;

		// floatDataに9.5を代入
		floatData = 9.5f;

		// doubleDataに10.5を代入
		doubleData = 10.5;

		// charDataにaを代入
		charData = 'a';

		// stringDataにハローを代入
		stringData = "ハロー";

		// boolにtureを代入
		bool = true;


		/*---------------------------------------
		 * [概要]　問4.変数を使ってコンソール出力
		 ----------------------------------------*/
		// 11110
		System.out.println(byteData + shortData + intData + longData);

		// 20
		System.out.println(byteData + byteData);

		// aハローtrue
		System.out.println(charData + stringData + bool);

		// 11130（変数の数字を全て足す）
		System.out.println(Math.round(byteData + shortData + intData + longData + floatData + doubleData));

		// 10000000000（小数点以外の数字を全てかける）
		System.out.println(byteData * shortData * intData * longData);

		// 0.105（10.5割る100をする）
		System.out.println(doubleData / shortData);

		// -90（10引く100をする）
		System.out.println(byteData - shortData);


		/*-----------------------------
		 *　[概要] 問5.動作の修正処理
		 -----------------------------*/
		// データ型をStringからintに変更
		int num = 20;
		int num1 = 23;

		// 出力
		System.out.println("ハローJAVA" + (num + num1));

		/*-------------------------------------------------------------------
		 * [概要]　問6.『』で囲われた人の情報を変数にして、formatの通りにコンソール出力
		 * [詳細]　ローカル変数に『山田太郎 18歳 170.5cm 62.2kg 寿司』を代入する
		 ---------------------------------------------------------------------*/
		// 名前の初期値を設定
		String name = "山田太郎";

		// 年齢の初期値を設定
		int age = 18;

		// 身長(cm)の初期値を設定
		double height = 170.5;

		// 体重の初期値を設定
		double weight = 62.2;

		// 好きな食べ物の初期値を設定
		String favoriteFood = "寿司";

		// 出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");


		/*---------------------------------------------------
		 * [概要]　問7.6で作成した自己紹介に続いてBMIの出力処理
		 ----------------------------------------------------*/
		//身長(m)の初期値を設定
		double height_m = 1.705;

		// 出力
		System.out.println("BMIは" + (double)Math.round((weight / (height_m * height_m))*10)/10 + "です");


		/*----------------------------------------------------
		 * [概要]　問8.6で宣言した変数に再代入・コンソール出力処理
		 -------------------------------------------------------*/
		// 名前に再代入する
		name = "鈴木一郎";

		// 年齢に再代入する
		age = 24;

		// 身長(cm)に再代入する
		height = 168.5;

		// 体重に再代入する
		weight = 64.2;

		// 好きな食べ物に再代入する
		favoriteFood = "オムライス";

		// 身長(m)に再代入する
		height_m = 1.685;

		// 出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		System.out.println("BMIは" + (double)Math.round((weight / (height_m * height_m))*10)/10 + "です");


		/*------------------------------------------------------------------------
		 *　[概要]　問9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、コンソール出力
		 -------------------------------------------------------------------------*/
		//　出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + (age += age) + "歳です");
		System.out.println("身長は" + (height += height) + "cmです");
		System.out.println("体重は" + (weight += weight) + "kgです");
		System.out.println("好きな食べ物は" + favoriteFood + "です");
		System.out.println("BMIは" + (double)Math.round(((weight += weight) / ((height_m += height_m) * (height_m += height_m)))*10)/10 + "です");


		/*---------------------------------------------------------------------
		 * [概要]　問10.8で使用した年齢が25歳以上ならtrueが出力されるようする（if文は使わない）
		 ----------------------------------------------------------------------*/
		// 出力
		System.out.println(age >= 25);


		/*----------------------------------------------------------------
		 * [概要]　問11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力
		 -----------------------------------------------------------------*/
		// 各変数をString型に変換する
		//　年齢
		String strage = String.valueOf(age);

		//　身長
		String strheight = String.valueOf(height);

		//　体重
		String strweight = String.valueOf(weight);

		// 全て繋げて出力
		System.out.println(strage + strheight + strweight);


		/*-----------------------------------------------------
		 * [概要]　問12.11で変換した【年齢・身長】を整数型に変換して出力
		 -----------------------------------------------------*/
		//　年齢
		int age_int = Integer.parseInt(strage);

		//　身長
		//　一度doubleに変換し整数型にする
		double height_double = Double.parseDouble(strheight);
		int height_int = (int)height_double;

		//　出力
		System.out.println(age_int);
		System.out.println(height_int);


		/*-----------------------------------------------------------------------------
		 *　[概要]　問13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
		 ------------------------------------------------------------------------------*/
		//　出力
		System.out.println(age_int >= 25 || height_int >= 160);
	}

}
