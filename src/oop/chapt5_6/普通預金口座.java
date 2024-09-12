package oop.chapt5_6;

import java.math.BigDecimal;

/**
 * 普通預金口座
 */
public class 普通預金口座 extends 口座 {
	
	public 普通預金口座(String 口座番号) {
		super(口座番号);
		System.out.println("[INFO] 普通預金口座コンストラクタを実行 : 口座番号=" + 口座番号);
	}
	
	//抽象メソッドの実装
	public void 残高を最新にする() {
		System.out.println("[INFO] ネットバンキングAPIで普通預金口座の残高を最新にしました。 : 口座番号=" + this.get口座番号());
		BigDecimal 最新残高 = new BigDecimal(100); //ネットバンキングAPIで取得する
		this.set残高(最新残高);
	}
}
