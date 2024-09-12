package oop.chapt5_4;

import java.math.BigDecimal;

/**
 * 預金口座 
 * 抽象メソッド close() を持つ
 */
public abstract class 預金口座 {
    private String 口座番号 = "";
    private BigDecimal 残高 ;
    
    //コンストラクタ
    public 預金口座() {
        super();
        this.残高 = new BigDecimal(0);
    }
    
    //解約する（抽象メソッド）
    public abstract boolean 解約する();
}
