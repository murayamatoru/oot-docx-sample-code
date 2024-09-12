package oop.chapt2_5;

/**
 * 普通預金口座
 */
public class OrdinaryAccount extends Account  {
    public OrdinaryAccount() {
        super();
    }
    public boolean close() {
        boolean result = true;
        // 普通預金の解約チェックを行い、結果をresultに設定する
        // 解約できる場合のみ解約する
        return result;
    }
}
