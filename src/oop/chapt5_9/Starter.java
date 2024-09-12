package oop.chapt5_9;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * 最初に起動されるクラス
 */
public class Starter {
	public static void main(String[] args) {
		Radio radio = new Radio();
		Class c = radio.getClass();
		System.out.println("ref_a is an instance of " + c.getName());
		Method[] methods = c.getMethods();
		System.out.println("<method name list>");
		for (int i = 0; i < methods.length; i++) {
			System.out.println("[" + i + "] " + methods[i].getName());
		}
		if (radio instanceof Radio) {
			System.out.println("radioはRadioクラスのインスタンスを参照している");
		}
		if (radio instanceof Recorder) {
			System.out.println("radioはRecorderクラスのインスタンスを参照している");
		}
		if (radio instanceof Clock) {
			System.out.println("radioはClockクラスのインスタンスを参照している");
		}
	}
}

/**
 * Radioクラス
 * RecorderとClockを実装する
 */
class Radio implements Recorder, Clock {
	public Radio() {
	}

	public void tune(int station) {
		//選局するためのコード
	}

	public void record() {
		//Recorderのrecord(録音する)を実装するためのコード
	}

	public void play() {
		//Recorderのplay(再生する)を実装するためのコード
	}

	public void setTime(Date time) {
		//ClockのsetTime(時刻を合わせる)を実装するためのコード
	}

	public Date getTime() {
		Date current = null;
		//ClockのgetTime(時刻を見る)を実装するためのコード
		return current;
	}
}

/**
 * Recorderインタフェース
 */
interface Recorder {
	public void record();

	public void play();
}

/**
 * Clockインタフェース
 */
interface Clock {
	public void setTime(Date time);

	public Date getTime();
}