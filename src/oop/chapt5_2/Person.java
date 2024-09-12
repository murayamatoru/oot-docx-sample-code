package oop.chapt5_2;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String name;
	private LocalDate birthDay;

	//コンストラクタ
	public Person(String name, LocalDate birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}

	//テスト開始
	public static void main(String[] args) {
		Person p1 = new Person("令和太朗", LocalDate.of(2000, 1, 1));
		System.out.println("現在の年齢は " + p1.getAge());
		
		LocalDate targetDay = LocalDate.of(2030, 12, 31);
		System.out.println(targetDay + "時点の年齢は " + p1.getAge(targetDay));
	}

	//現在の年齢を応答する
	public int getAge() {
		if (this.birthDay != null) {
			LocalDate currentDate = LocalDate.now();
			return Period.between(this.birthDay, currentDate).getYears();
		} else {
			return -1;
		}
	}
	
	//指定された年月日時点の年齢を応答する
	public int getAge(LocalDate targetDay) {
		if ((this.birthDay != null) && (targetDay != null)) {
			return Period.between(this.birthDay, targetDay).getYears();
		} else {
			return -1;
		}
	}

}
