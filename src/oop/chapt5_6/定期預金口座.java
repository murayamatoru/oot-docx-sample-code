package oop.chapt5_6;

import java.math.BigDecimal;

/**
 * 定期預金口座
 */
public class 定期預金口座 extends 口座 {
	
	private int 期間;

	public 定期預金口座(String 口座番号, int 期間) {
		super(口座番号);
		this.期間 = 期間;
		System.out.println("[INFO] 定期預金口座コンストラクタを実行 : 口座番号=" + 口座番号);
	}

	//抽象メソッドの実装
	public void 残高を最新にする() {
		System.out.println("[INFO] ネットバンキングAPIで定期預金口座の残高を最新にしました。 : 口座番号=" + this.get口座番号());
		BigDecimal 最新残高 = new BigDecimal(100); //ネットバンキングAPIで取得する
		this.set残高(最新残高);
	}

	public int get期間() {
		return 期間;
	}

	public void set期間(int 期間) {
		this.期間 = 期間;
	}
}
