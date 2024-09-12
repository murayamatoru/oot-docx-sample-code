package oop.chapt5;

import java.util.ArrayList;

/**
 * 制御フロー文 
 */
public class Sample4 {

    public int method() {

        int a = 1;
        int b = 2;

        //if文
        if (a < b) {  //条件式
            //真の場合
        } else {
            //偽の場合
        }

        //switch文
        switch (a) {    //a は整数式
            case 2:
                //a がラベル(整数定数 2)と等しい場合の処理
                break;    //ある場合は次のラベルの評価をしない。switchを終了する
            case 3:
                //a がラベル(整数定数 3)と等しい場合の処理
            default:
                //a がどのラベルとも違う場合の処理
        }

        //while文
        while (a < b) {
            //繰り返す処理
        }

        //do-while文
        do {
            //繰り返す処理
        } while (a < b);

        //for文
        for (int i = 0; i < a; i++) {
            //繰り返す処理
        }
        
        //拡張for文
        ArrayList<String> list1 = new ArrayList<>();
        for(String s : list1) {
        	System.out.println(s);
        }
        
        //Stream#forEachメソッド
        list1.stream().forEach(s -> System.out.println(s));

        //break文
        for (int i = 0; i < a; i++) {
            //繰り返す処理
            if (i == b) {
                break;   //ループを終了する
            }
            //繰り返す処理
        }

        //continue文
        for (int i = 0; i < a; i++) {
            //繰り返す処理
            if (i == b) {
                continue;  //ループ本体の終りに制御を移し次にループ式を評価する
            }
            //繰り返す処理
        }

        //return文
        return a;
    }
}
