package oop.chap2_3;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 定期預金口座クラス
 */
public class 定期預金口座 extends 預金口座 {
	private LocalDate 満期日; //定期預金だけの属性
	
	//コンストラクタ
	public 定期預金口座(
			String 名義人,
			String 口座番号,
			BigDecimal 残額,
			LocalDate 開設日,
			LocalDate 満期日) {
		super(名義人, 口座番号, 残額, 開設日);
		this.満期日 = 満期日;
	}

	public void deposit(int p_amount) {
		// 定期預金口座の場合の入金処理
	}

	public void withdraw(int p_amount) {
		// 定期預金口座の場合の引出し処理
	}
}
