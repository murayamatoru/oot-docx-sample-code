package oop.chapt2_6;

import java.util.ArrayList;

import oop.chapt2_5.Account;
import oop.chapt2_5.FixedAccount;
import oop.chapt2_5.OrdinaryAccount;

/**
 * 預金者
 * openFixed5YearsAccount() を追加した
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
    
    public void openFixed5YearsAccount() {
        FixedAccount f5a = new Fixed5YearsAccount();
        // 定期預金口座を開設し、開設口座リストに追加する
        accountList.add(f5a);
    }
    
    public void closeAllAccounts() {
        for (Account a : accountList) {
            // 開設済みの全ての預金口座(普通か定期)を解約する
            a.close();
        }
    }
}