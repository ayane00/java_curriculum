package curriculum1_25;

// スーパークラス（Status）
public class Status {

	// フィールドに各変数を定義する
	// 名前
	private String userName;
	// HP
	private int hp;
	// MP
	private int mp;
	// 攻撃力
	private int attack;
	// 素早さ
	private int quick;
	// 防御力
	private int defense;

	// userNameのセッター
	public void setName(String userName) {
		this.userName = userName;
	}

	// userNameのゲッター
	public String getName() {
		return this.userName;
	}

	// hpのセッター
	public void setHp(int value_hp) {
		this.hp = value_hp;
	}

	// hpのゲッター
	public int getHp() {
		return this.hp;
	}

	// mpのセッター
	public void setMp(int value_mp) {
		this.mp = value_mp;
	}

	// mpのゲッター
	public int getMp() {
		return this.mp;
	}

	// attackのセッター
	public void setAttack(int value_attack) {
		this.attack = value_attack;
	}

	// attackのゲッター
	public int getAttack() {
		return this.attack;
	}

	// quickのセッター
	public void setQuick(int value_quick) {
		this.quick = value_quick;
	}

	// quickのゲッター
	public int getQuick() {
		return this.quick;
	}

	// defenseのセッター
	public void setDefense(int value_df) {
		this.defense = value_df;
	}

	// defenseのゲッター
	public int getDefense() {
		return this.defense;
	}

	// 名前に対するコンストラクタ
	public Status(String userName) {
		this.userName = userName;
	}

	// 各項目（HP,MP,攻撃力,素早さ,防御力）の値に対するコンストラクタ
	public Status() {
		// どの項目においても初期値を0とする
		this.hp = 0;
		this.mp = 0;
		this.attack = 0;
		this.quick = 0;
		this.defense = 0;
	}

}
