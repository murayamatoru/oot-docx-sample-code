package oop.chap2_3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class 普通預金口座 extends 預金口座 {

	//コンストラクタ
	public 普通預金口座(
			String 名義人,
			String 口座番号,
			BigDecimal 残額,
			LocalDate 開設日) {
		super(名義人, 口座番号, 残額, 開設日);
		//この例では預金口座クラスのコンストラクタを呼び出すだけ
	}

	public void deposit(int p_amount) {
		// 普通預金口座の場合の入金処理
	}

	public void withdraw(int p_amount) {
		// 普通預金口座の場合の引出し処理
	}
}
