package oop.chap2_2;

import java.math.BigDecimal;

public class 普通預金口座 {
	
	private static BigDecimal 利率 = new BigDecimal("0.001");
	private BigDecimal 残高; //ここではデータベースから復元した金額が設定されているものとする
	
	public void 預入れる(BigDecimal 預入れ額) {
		残高 = 残高.add(預入れ額); //BigDecimal型の加算
	}
	public void 引き出す(BigDecimal 引き出し額) {
		残高 = 残高.subtract(引き出し額); //BigDecimal型の減算	
	}
	public void 解約する() {
		//解約処理
	}
}
