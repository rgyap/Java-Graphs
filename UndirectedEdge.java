import java.util.Objects;

public class UndirectedEdge<T> extends Edge<T> {

    public UndirectedEdge(T s, T e) {
        super(s,e);
    }

    @Override
    public boolean equals(Object e) {
        if (this == e) {
            return true;
        }
        if (e == null || getClass() != e.getClass()) {
            return false;
        }
        UndirectedEdge that = (UndirectedEdge) e;
        return (Objects.equals(this.start, that.start) && Objects.equals(this.end, that.end)) || (Objects.equals(this.start, that.end) && Objects.equals(this.end, that.start));
    }

    @Override 
    public int hashCode() {
        int a = this.start.hashCode();
        int b = this.end.hashCode();
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        return 31*min + max;
    }

}