package oop.chapt5_7;

/**
 * 最初にコマンドラインから始動されるクラス 
 */
public class Starter {
    public static void main(String[] args) {
        ClassA ref_a;
        ClassB ref_b;
        System.out.println ("ClassAのインスタンスを生成する");
        ref_a = new ClassA();
        System.out.println ("publicフィールド参照の場合、ref_a.same_name=" + ref_a.same_name);
        System.out.println ("メソッド参照の場合、ref_a.getSameName()=" + ref_a.getSameName());
        System.out.println ("メソッド参照の場合、ref_a.getSameName2()=" + ref_a.getSameName2());
        System.out.println ("\nClassBのインスタンスを生成する");
        ref_b = new ClassB();
        System.out.println ("publicフィールド参照の場合、ref_b.same_name=" + ref_b.same_name);
        System.out.println ("メソッド参照の場合、ref_b.getSameName()=" + ref_b.getSameName());
        System.out.println ("メソッド参照の場合、ref_b.getSameName2()=" + ref_b.getSameName2());
        System.out.println ("\nref_aにref_bを代入する(キャストする)");
        if (ref_b instanceof ClassB) { 
            ref_a = ref_b;
        }
        System.out.println ("publicフィールド参照の場合、ref_a.same_name=" + ref_a.same_name);
        System.out.println ("メソッド参照の場合、ref_a.getSameName()=" + ref_a.getSameName());
        System.out.println ("メソッド参照の場合、ref_a.getSameName2()=" + ref_a.getSameName2());
    }
}

/**
 * スーパークラス ClassA
 */
class ClassA extends Object {
    String same_name;
    public String getSameName() {
        return (same_name);
    }
    public String getSameName2() {
        return (same_name);
    }
    public ClassA() {
        same_name = "A";
        System.out.println ("コンストラクタClassA()が実行された");
    }
}

/**
 *  ClassA のサブクラス ClassB
 */
class ClassB extends ClassA {
    String same_name;
    public String getSameName2() {  //オーバーライドしたメソッド
        return (same_name);
    }
    public ClassB() {
        same_name = "B";
        System.out.println ("コンストラクタClassB()が実行された");
        System.out.println ("コンストラクタClassB()中から same_name=" + same_name);
        System.out.println ("コンストラクタClassB()中から super.same_name=" + super.same_name);
    }
}
