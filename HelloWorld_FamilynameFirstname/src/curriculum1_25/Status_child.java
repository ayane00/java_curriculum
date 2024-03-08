package curriculum1_25;

// Statuクラスを継承したサブクラス（Status_child）
public class Status_child extends Status {

	// 引数ありのコンストラクタ（名前用）を作成
	public Status_child(String userName) {
		super(userName);
	}

	// 引数なしのコンストラクタ（各項目の値用）を作成
	public Status_child() {
		super();
	}

}
