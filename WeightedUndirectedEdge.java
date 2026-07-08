public class WeightedUndirectedEdge<T> extends UndirectedEdge<T> {

    private final double weight;

    public WeightedUndirectedEdge(T s, T e, double w) {
        super(s, e);
        this.weight = w;
    }

    public double getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object e) {
        if (this == e) { 
            return true;
        }
        if (e == null || getClass() != e.getClass()) {
            return false;
        }
        WeightedUndirectedEdge that = (WeightedUndirectedEdge) e;
        return (this.weight == that.weight) && super.equals((UndirectedEdge) that);
    }

    @Override 
    public int hashCode() {
        int a = this.start.hashCode();
        int b = this.end.hashCode();
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        long xx = Double.doubleToLongBits(this.weight);
        int w = (int) (xx >>> 32);

        return 31*min + 7*w + max;
    }

    public static WeightedUndirectedEdge<Object> giveWeight(UndirectedEdge<Object> e, double w) {
        Object start = e.getStart();
        Object end = e.getEnd();
        return new WeightedUndirectedEdge<>(start, end, w);
    }

}