public class Main<T>{
    private T value;
 
    public Main(T val){
        this.value = val;
    }
 
    public T getValue(){
        return value;
    }
}
class GenericSample<T> extends Main{
   // private T value;
 
    public GenericSample(T val){
        super(val);
        //this.value = val;
    }
 
    // public T getValue(){
    //     return value;a
    // }
}
class Main2 {
    public static void main(String[] args) {
        // Object型のジェネリクス
        GenericSample<String> obj = new GenericSample<String>("ポテパン");
        System.out.println(obj.getValue());
        //GenericSample<Object> gobj = new GenericSample<Object>("ポテパン");
        // String型のジェネリクス(ワイルドカードを使用)
        GenericSample<Main> obj2 = new GenericSample<Main>(new Main<String>("ポテパン"));
        GenericSample<? super GenericSample> gstr;
        gstr = obj2;
        Object obj3 = gstr.getValue();
        System.out.println(obj3);
    }
}