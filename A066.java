import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//　エンクロージングクラス
class Enclosing {
    private int field;
    private  int field2;

    Enclosing(int field) {
        this.field = field;      
    }

   
    
    // メッセージが送られた Enclosing インスタンスにひもづく NonStatic インスタンスを生成
    NonStaticClass createNonStaticInstance(int field) {
        //this.field2 = StaticClass.fields;
        return new NonStaticClass(field);
    }

  

    // 非 static クラス
    static class StaticClass {
        private int fields;

        StaticClass(int field) {
            this.fields = field;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder(64);
            s.append("Enclosing.field: ");
            // エンクロージングクラスのインスタンスにアクセスする
           // s.append(Enclosing.field);
            s.append(", NonStatic.field: ");
            s.append(this.fields);
            return s.toString();
        }
    }

    class NonStaticClass {
        private int fieldns;

        NonStaticClass(int field) {
            this.fieldns = field;
        }

        @Override
        public String toString() {
            StringBuilder s = new StringBuilder(64);
            s.append("Enclosing.field: ");
            // エンクロージングクラスのインスタンスにアクセスする
            s.append(Enclosing.this.field);
            s.append(", NonStatic.field: ");
            s.append(this.fieldns);
            return s.toString();
        }
    }
}

class A066 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        List<Object> objectList = new ArrayList<Object>();
        objectList.add((String)"e");
// => ジェネリックス型は不変なのでコンパイルエラー

        List<?>[] objectArray = {strings,objectList,new ArrayList<String>()};
        Map<String, List<String>> map = new HashMap<>();



        //List<Object> string = (List<Object>)strings;
       // エンクロージングインスタンスを明示的にした紐付け
        Enclosing enclosing1 = new Enclosing(1);
        Enclosing.NonStaticClass nonStatic1 = enclosing1.new NonStaticClass(2);

        // createNonStaticInstance を使った暗黙的な紐付け
        Enclosing enclosing2 = new Enclosing(999);
        Enclosing.NonStaticClass nonStatic2 = enclosing2.createNonStaticInstance(1000);

        System.out.println(nonStatic1);
        System.out.println(nonStatic2);
    }
}