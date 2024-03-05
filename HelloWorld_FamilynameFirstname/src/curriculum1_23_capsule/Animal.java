package curriculum1_23_capsule;

public class Animal {
	// フィールドに各変数名を定義する
	private String animalName;
	private double bodyLength;
	private int speed;

	// animalNameのセッター
	public void setName(String animal_name) {
		this.animalName = animal_name;
	}

	// animalNameのゲッター
	public String getanimalName() {
		return this.animalName;
	}

	// bodyLengthのセッター
	public void setLength(double animal_length) {
		this.bodyLength = animal_length;
	}

	// bodyLengthのゲッター
	public double getLength() {
		return this.bodyLength;
	}

	// speedのセッター
	public void setSpeed(int animal_speed) {
		this.speed = animal_speed;
	}

	// speedのゲッター
	public int getSpeed() {
		return this.speed;
	}
}
