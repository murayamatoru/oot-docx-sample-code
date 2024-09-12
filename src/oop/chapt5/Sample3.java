package oop.chapt5;

/**
 * 演算子 
 */
public class Sample3 {

    public void method() {

        int i = 0;
        int j = ++i;  //インクリメント演算子
        int k = --i;  //デクリメント演算子

        if ( i > j)  { }   //関係演算子（大なり）
        if ( i >= j) { }   //関係演算子（以上）
        if ( i < j)  { }   //関係演算子（小なり）
        if ( i <= j) { }   //関係演算子（以下）
        if ( i == j) { }   //関係演算子（等しい）
        if ( i != j) { }   //関係演算子（等しくない）

        if (!(i > j)) { }           //論理否定
        if ((i > j) & (i > k)) { }  //論理積（AND）
        if ((i > j) | (i > k)) { }  //論理和（OR）
        if ((i > j) ^ (i > k)) { }  //排他的論理和（XOR）
        if ((i > j) && (i > k)) { } //条件積（左側が先に評価され必要な場合のみ次が評価される）
        if ((i > j) || (i > k)) { } //条件和（左側が先に評価され必要な場合のみ次が評価される）

        int a = 0xF00F;
        int b = 0x0FF0;
        int c = 0xAAAA;

        int d = a & b; //0x0000 二項ビット演算子（ビット積 AND)
        int e = a | b; //0xFFFF 二項ビット演算子（ビット和 OR)
        int f = c ^ e; //0x5555 二項ビット演算子（排他的ビット和 XOR)

        int x = a << 2;   //2ビット左シフトで右側をゼロで埋める
        int y = b >> 2;   //2ビット右シフトで左側を符号ビット（最上位）で埋める
        int z = b >>> 2;  //2ビット右シフトで左側をゼロで埋める


        //instanceof 演算子
        String s1 = "ABC";
        if (s1 instanceof String) {
            System.out.println("s1 は Stringクラスのインスタンスです");
        }

        //条件演算子 ?:
        x = ((a < b) ? a : b);
        /*
                if (a < b) {
                    x = a;
                } else {
                    x = b;
                }
        */

        //代入演算子
        x = 1;
        x = y = z = 1;
        x += 1;         //x = x + 1;
        x *= 2;         //x = x * 2;

        //文字列結合演算子
        String s2 = "DEF";
        String s3 = s1 + s2; //"ABCDEF"
        s3 += s2;            //s3 = s3 + s2;

        //new 演算子
        String s4 = new String("GHI");

    }
}
