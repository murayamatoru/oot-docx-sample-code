package oop.chap2_4;

import java.util.ArrayList;

public class 預金者 {
    private ArrayList<預金口座> 開設口座リスト;
    public 預金者() {
        super();
        this.開設口座リスト = new ArrayList<預金口座>();
    }
    public ArrayList<預金口座> get開設口座リスト() {
        return 開設口座リスト;
    }
}
