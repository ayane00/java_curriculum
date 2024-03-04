package countryClass_do;

// countryClassをインポートする
import countryClass.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Japan_do {
	public static void main(String[] args) {
		// Japanクラスを呼び出して変数に代入する
		Japan inJapan = new Japan();

		// 内容をを出力する
		System.out.println(inJapan.hallo + "!" + "ここは" + inJapan.place + "です！");
		System.out.println("この" + inJapan.food + "はうまい");
		System.out.println(inJapan.food + "は" + inJapan.adoutFood + "です");

		// 現在の日時の表示設定・出力する
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String formatNowDate = dtf.format(nowDate);
		System.out.println("今の現在日時は" + formatNowDate + "です");
	}
}
