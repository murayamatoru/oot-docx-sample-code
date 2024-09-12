package oop.chapt5;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

	private String name;
	private LocalDate birthDay;

	public Person(String name, LocalDate birthDay) {
		this.name = name;
		this.birthDay = birthDay;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDay, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(birthDay, other.birthDay) && Objects.equals(name, other.name);
	}

	//テスト開始
	public static void main(String[] args) {
		Person p1 = new Person("令和太朗", LocalDate.of(2000, 1, 1));
		Person p2 = new Person("令和太朗", LocalDate.of(2000, 1, 1));

		if (p1 == p2) {
			//実行されません
		} else {
			System.out.println("同名・同生年月日でも同一ではありません");
		}
		if (p1.equals(p2)) {
			System.out.println("同名・同生年月日なら同値です");
		} else {
			//実行されません
		}
		
		Person p3 = p1;
		if (p1 == p3) {
			System.out.println("同一です");
		}
			
		
		Integer integer1 = new Integer(1);
		Integer integer2 = new Integer(1);
		
		if (integer1 == integer2) {
			//実行されません
		} else {
			System.out.println("同じ整数値でも同一ではありません。別のインスタンスです");
		}
		if (integer1.equals(integer2)) {
			System.out.println("同じ整数値なら同値です");
		} else {
			//実行されません
		}
	}
	
}
