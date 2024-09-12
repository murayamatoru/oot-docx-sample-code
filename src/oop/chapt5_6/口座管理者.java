package oop.chapt5_6;

import java.util.ArrayList;

/**
 * 口座管理者
 */
public class 口座管理者 {
	
	private static ArrayList<口座> 口座リスト = new ArrayList<>();

	//Javaアプリケーション開始メソッド
	public static void main(String[] args) {
		System.out.println("--- テスト開始 ---");
		口座管理者 管理者 = new 口座管理者();
		管理者.doTest();
		System.out.println("--- テスト終了 ---");
	}
	
	//テストする
	private void doTest() {
		System.out.println("--- この会社が所有しているすべての口座情報を追加します ---");
		this.add口座(new 普通預金口座("1001"));
		this.add口座(new 普通預金口座("1002"));
		this.add口座(new 定期預金口座("8001", 3));
		
		System.out.println("--- すべての口座の残高を最新にします ---");
		for(口座 kouza : 口座リスト) {
			kouza.残高を最新にする();
		}
		//for文ではなくStreamを使った場合
		口座リスト.stream().forEach(k -> k.残高を最新にする());
	}
	
	public void add口座(口座 kouza) {
		口座リスト.add(kouza);
	}
}
