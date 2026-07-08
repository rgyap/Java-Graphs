public abstract class Edge<T> {
    protected final T start;
    protected final T end;

    public Edge(T s, T e) {
        this.start = s;
        this.end = e;
    }

    public T getStart() {
        return this.start;
    }

    public T getEnd() {
        return this.end;
    }

    public Object[] getStartAndEnd() {
        Object[] result = {this.start, this.end};
        return result;
    }
    /*
    @Override
    public int hashCode() {
        return Objects.hash(Math.min(this.start.hashCode(), this.end.hashCode()), Math.max(this.start.hashCode(), this.end.hashCode()));
    }*/

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object o);
}