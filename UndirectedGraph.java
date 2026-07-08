import java.util.ArrayList;
import java.util.HashSet;

public class UndirectedGraph<V> extends Graph<V, UndirectedEdge<V>> {

    public UndirectedGraph() {
        super();
    }

    public UndirectedGraph(ArrayList<V> v, ArrayList<UndirectedEdge<V>> e) {
        super(v,e);
    }

    public UndirectedGraph(HashSet<V> v, HashSet<UndirectedEdge<V>> e) {
        super(v,e);
    }
 

}