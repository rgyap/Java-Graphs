
public class Main {

    public static void main(String[] args) {

        DirectedEdge<Integer> a = new DirectedEdge<>(1, 3);
        DirectedEdge<Integer> b0 = new DirectedEdge<>(1, 3);
        DirectedEdge<Integer> b1 = new DirectedEdge<>(3, 1);

        UndirectedEdge<Integer> c = new UndirectedEdge<>(2, 3);
        UndirectedEdge<Integer> d = new UndirectedEdge<>(3, 2); 

        WeightedUndirectedEdge<Integer> e = new WeightedUndirectedEdge<>(12, 13, -10);
        WeightedUndirectedEdge<Integer> e2 = new WeightedUndirectedEdge<>(12, 13, -10);
        WeightedUndirectedEdge<Integer> f = new WeightedUndirectedEdge<>(13, 12, 110);
        
        UndirectedGraph<Integer> g1 = new UndirectedGraph<>();
        Graph<Integer, UndirectedEdge<Integer>> g2 = new Graph<>();


        g1.addEdge(c);
        g2.addEdge(d);

        System.out.println(a);
        System.out.println(b0);
        System.out.println(b1);
        System.out.println(e);
        System.out.println(e2.equals(e));

    

    }
 

}