package oop.chapt2_5;

/**
 * 定期預金口座
 */
public class FixedAccount extends Account  {
    public FixedAccount() {
        super();
    }
    public boolean close() {
        boolean result = true;
        // 定期預金の解約チェックを行い、結果をresultに設定する
        // 解約できる場合のみ解約する
        return result;
    }
}
