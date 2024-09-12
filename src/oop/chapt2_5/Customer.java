package oop.chapt2_5;

import java.util.ArrayList;

/**
 * 預金者
 */
public class Customer {
    private ArrayList<Account> accountList; // 開設口座リスト
    public Customer() {
        super();
        accountList = new ArrayList<Account>();
    }
    public void openOrdinaryAccount() {
        OrdinaryAccount oa = new OrdinaryAccount();
        // 普通預金口座を開設し、開設口座リストに追加する
        accountList.add(oa);
    }
    public void openFixedAccount() {
        FixedAccount fa = new FixedAccount();
        // 定期預金口座を開設し、開設口座リストに追加する
        accountList.add(fa);
    }
    public void closeAllAccounts() {
        for (Account a : accountList) {
             // 開設済みの全ての預金口座(普通か定期)を解約する
            a.close();
        }
    }
}
