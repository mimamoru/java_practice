import java.util.function.Consumer;
import java.util.stream.Stream;

public class OriginalList<T extends Object> {
    private OriginalList<T> previous;
    private OriginalList<T> next;

    
    private T value;

    OriginalList() {}
    OriginalList(T value) {
        this.value = value;
    }

    public void add(T value) {
        OriginalList<T> last = this;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new OriginalList<T>(value);
        last.next.previous = last;
    }

    public T get(int idx) {
        OriginalList<T> current = this;
        for (int i=0; i<idx+1; i++) {
            current = current.next;
        }
        return current.value;
    }

    public boolean contains(T t) {
        OriginalList<T> current = this;
        while (current.next != null) {
            current = current.next;
            if (current.value.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T t) {
        OriginalList<T> current = this;
        int i = 0;
        while (current.next != null) {
            
            current = current.next;
            if (t.equals(current.value)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(T t) {
        OriginalList<T> current = this;
        int i = 0;
        int idx = -1;
        while (current.next != null) {
            
            current = current.next;
            if (t.equals(current.value)) {
                idx = i;
            }
            i++;
        }
        return idx;
    }

    public boolean isEmpty() {
        return this.next == null ? true : false;
    }

    public T remove(int idx){
        OriginalList<T> current = this;
        for(int i = 0; i<idx; i++){
            current=current.next;
        }
      
        if(current.next.next == null){
            T tmp=current.next.value;
            current.next = null;
            return tmp;
        }    
        T tmp=current.next.value;
        current.next = current.next.next;
        current.next.previous = current;    
        return tmp; 
    }

    public void clear(){
        this.next = null;
    }

    public int size() {
        int i = 0;
        OriginalList<T> last = this;
        while (last.next != null) {
            last = last.next;
            i++;
        }
        return i < Integer.MAX_VALUE ? i : Integer.MAX_VALUE;
    }

    public Object[] toArray(Object[] t) {
        for (int i=0; i<this.size(); i++) {
            t[i] = this.get(i);
        }
        return t;
    }

    public T set(int idx,  T value) {
        OriginalList<T> current = this;
        for (int i=0; i<idx+1; i++) {
            current = current.next;
        }
        T prevalue = current.value;
        current.value = value;
        return prevalue;
    }

    public Stream<T> stream() {
        OriginalList<T> current = this;
        Stream.Builder<T> builder = Stream.builder();
        while (current.next != null) {
            current = current.next;
            builder.add(current.value);
        }
        return builder.build();
       //return  Stream.of(this.toArray(new Object[this.size()-1]));    
    }

    @Override
    public String toString() {
        OriginalList<T> current = this;
        String[] s = new String[this.size()];
        int i = 0;
        while (current.next != null) {
            current = current.next;
            s[i++] = current.value.toString();
        }
        return "[" + String.join(",", s) + "]";
    }
}