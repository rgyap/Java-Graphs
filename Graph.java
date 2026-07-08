import java.util.ArrayList;
import java.util.HashSet;

public class Graph<V, E extends Edge<V>> { 

    private final HashSet<V> vertices;
    private final HashSet<E> edges;

    public Graph() {
        this.vertices = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public Graph(ArrayList<V> v, ArrayList<E> e) {
        this.vertices = new HashSet<>(v);
        this.edges = new HashSet<>(e);
    }

    public Graph(HashSet<V> v, HashSet<E> e) {
        this.vertices = v;
        this.edges = new HashSet<>(e);
    }


    public ArrayList<V> getVerticesList() {
        ArrayList<V> result = new ArrayList<>();
        for (V v : this.vertices) {
            result.add(v);
        }
        return result;
    }

    public ArrayList<E> getEdgesList() {
        ArrayList<E> result = new ArrayList<>();
        for (E e : this.edges) {
            result.add(e);
        }
        return result;
    }

    public HashSet<E> getEdgeSet() {
        return this.edges;
    }

    public HashSet<V> getVertexSet() {
        return this.vertices;
    }
 

    
    public void addVertex(V v) {
        this.vertices.add(v);
    }

    public void addEdge(E e) {
        V a = e.getStart();
        V b = e.getEnd();

        this.addVertex(a);
        this.addVertex(b);

        this.edges.add(e);
    }

    public void removeVertex(V v) {
        this.vertices.remove(v);
        this.edges.removeIf(e -> e.getStart().equals(v) || e.getEnd().equals(v));
    }

    public void removeEdge(E e) {
        this.edges.remove(e);
    }
    
}