package oop.chap2_4;

public class 預金口座 {
    private String 口座番号;
    private String 名義人;
    public 預金口座() {
        super();
        this.口座番号 = "";
        this.名義人 = "";
    }
    public String get口座番号() {
        return 口座番号;
    }
    public String get名義人() {
        return 名義人;
    }
}
