package oop.chapt5_4;

/**
 * 定期預金口座
 */
class 定期預金口座 extends 預金口座 {
	
	//コンストラクタ
    public 定期預金口座() {
        super();
    }
    
    public boolean 解約する() {
        boolean result = true;
        // 定期預金の解約チェックを行い、結果（成否）を応答する
        // 解約できる場合のみ解約する
        return result;
    }
}
