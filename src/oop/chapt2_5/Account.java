package oop.chapt2_5;

/**
 * 預金口座
 *   抽象クラスなのでインスタンスは存在しない
 */
public abstract class Account {
    private String accountNumber; // 口座番号
    private Customer customer;
    
    /**
     * 実際には 各コンストラクタには引数(Account(Customer c)等)が必要と思われるが この例題では省略する
     */
    public Account() {
        super();
        accountNumber = "";
    }
    
    /**
     * 抽象メソッド close()
     * @return
     */
    public abstract boolean close();
}
