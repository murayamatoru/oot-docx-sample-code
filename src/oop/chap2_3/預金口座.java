package oop.chap2_3;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 預金口座クラス (抽象クラス)
 */
public abstract class 預金口座 {
	private String 名義人;
	private String 口座番号;
	private BigDecimal 残高;
	private LocalDate 開設日;

	//コンストラクタ
	public 預金口座(
			String 名義人,
			String 口座番号,
			BigDecimal 残高,
			LocalDate 開設日) {
		this.名義人 = 名義人;
		this.口座番号 = 口座番号;
		this.残高 = 残高;
		this.開設日 = 開設日;
	}

	public String getAccountNumber() { //口座番号を応答する
		return 口座番号;
	}
}
