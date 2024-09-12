package oop.chapt5_6;

import java.math.BigDecimal;

/**
 * 口座
 */
public abstract class 口座 {

	private String 口座番号;
	private BigDecimal 残高;
	
	protected 口座(String 口座番号) {
		this.口座番号 = 口座番号;
		this.残高 = new BigDecimal(0);
		System.out.println("[INFO] 口座コンストラクタを実行 : 口座番号=" + 口座番号);
	}

	public String get口座番号() {
		return 口座番号;
	}

	public void set口座番号(String 口座番号) {
		this.口座番号 = 口座番号;
	}
	
	
	public BigDecimal get残高() {
		return 残高;
	}

	public void set残高(BigDecimal 残高) {
		this.残高 = 残高;
	}
	
	//抽象メソッド
	public abstract void 残高を最新にする();
	
}
