import java.util.Objects;

public class DirectedEdge<T> extends Edge<T> {
    
    public DirectedEdge(T s, T e) {
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
        DirectedEdge that = (DirectedEdge) e;
        return (Objects.equals(this.start, that.start) && Objects.equals(this.end, that.end));
    }
    @Override
    public int hashCode() {
        int a = this.start.hashCode();
        int b = this.end.hashCode();
        return 31*a+b;
    }
}