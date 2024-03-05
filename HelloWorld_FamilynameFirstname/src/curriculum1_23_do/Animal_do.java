package curriculum1_23_do;

// パッケージcurriculum1_23_capsuleをインポートする
import curriculum1_23_capsule.*;

public class Animal_do {
	public static void main(String[] args) {

		// Animalクラスを呼び出して変数animalに代入する
		Animal animal = new Animal();

		// 動物名（ライオン）を格納する
		animal.setName("ライオン");

		// 体長（2.1）を格納する
		animal.setLength(2.1);

		// 速度（80）を格納する
		animal.setSpeed(80);

		// 各内容を出力する
		System.out.println("動物名：" + animal.getanimalName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");

	}

}
