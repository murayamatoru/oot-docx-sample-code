package oop.chapt5_3;

import java.math.BigDecimal;

public class 普通預金口座 {
	
	//クラス変数
	private static double 利率 = 0.01;
	
	//インスタンス変数
	private BigDecimal 残高;
	private String 口座番号;
	private String 名義名;
	
	//クラスメソッド
	public static double get利率() {
		return 利率;	
	}

	//インスタンスメソッド
	public BigDecimal get残高() {
		return this.残高;
	}
}
