import java.util.ArrayList;
import java.util.HashSet;

public class DirectedGraph<V> extends Graph<V, DirectedEdge<V>> {

    public DirectedGraph() {
        super();
    }

    public DirectedGraph(ArrayList<V> v, ArrayList<DirectedEdge<V>> e) {
        super(v,e);
    }

    public DirectedGraph(HashSet<V> v, HashSet<DirectedEdge<V>> e) {
        super(v,e);
    }
 

}