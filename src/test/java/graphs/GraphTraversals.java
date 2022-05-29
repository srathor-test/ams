package graphs;

import graphs.base.E;
import graphs.base.Network;
import graphs.base.V;
import org.junit.Test;

import java.util.*;

public class GraphTraversals {
    @Test
    public void testBFS() {
        V a = graph();

        Network graph = new Network(a);
        List<V> listOfVerticesBFSTraversal = new ArrayList<>();
        List<E> setOfEdgesMinimumSpanningTree = new ArrayList<>();
        bfs(graph, listOfVerticesBFSTraversal, setOfEdgesMinimumSpanningTree );
        System.out.println("L :" +listOfVerticesBFSTraversal);
        System.out.println("T " + setOfEdgesMinimumSpanningTree);
    }

    private void bfs(Network graph, List<V> l, List<E> t) {

        LinkedList<V> queue = new LinkedList<>();
        queue.addLast(graph.start);

        while(!queue.isEmpty()) {
            V x = queue.removeFirst();
            x.done = true;
            l.add(x);
            for(E y = x.edges; y != null; y = y.nextE) {
                if(!y.to.done) {
                    t.add(y);
                    queue.addLast(y.to);
                    y.to.done = true;
                }
            }
        }
    }



    @Test
    public void testDFS() {
        V a = graph();

        Network graph = new Network(a);
        List<V> listOfVerticesBFSTraversal = new ArrayList<>();
        List<E> setOfEdgesMinimumSpanningTree = new ArrayList<>();
        dfs(graph, listOfVerticesBFSTraversal, setOfEdgesMinimumSpanningTree );
        System.out.println("L :" +listOfVerticesBFSTraversal);
        System.out.println("T " + setOfEdgesMinimumSpanningTree);
    }


    private void dfs(Network graph, List<V> l, List<E> t) {
        V x = graph.start;
        dfs_rec(x, l, t);

    }

    private void dfs_rec(V x, List<V> l, List<E> t) {
        l.add(x);
        x.done = true;
        for(E y = x.edges; y != null; y = y.nextE) {
            if(!y.to.done) {
                t.add(y);
                y.to.done = true;
                dfs_rec(y.to, l, t);
            }
        }
    }

    private V graph() {
    /*
            A --- B --- C --- D
            |   / |   / |   /
             E     F      G
     */

        //create vertices
        V a = new V("A");
        V b = new V("B");
        V c = new V("C");
        V d = new V("D");
        V e = new V("E");
        V f = new V("F");
        V g = new V("G");

        //link vertices
        a.nextVertex=b;
        b.nextVertex=c;
        c.nextVertex=d;
        d.nextVertex=e;
        e.nextVertex=f;
        f.nextVertex=g;

        // create edge list
        E ab = new E(a,b);
        E ae = new E(a,e);
        a.addEdge(ab);
        a.addEdge(ae);

        E ba = new E(b,a);
        E bc = new E(b,c);
        E be = new E(b,e);
        E bf = new E(b,f);

        b.addEdge(ba);
        b.addEdge(bc);
        b.addEdge(be);
        b.addEdge(bf);
            /*
                A --- B --- C --- D
                |   / |   / |   /
                 E     F      G
         */
        E cb = new E(c,b);
        E cd = new E(c,d);
        E cf = new E(c,f);
        E cg = new E(c,g);

        c.addEdge(cb);
        c.addEdge(cd);
        c.addEdge(cf);
        c.addEdge(cg);

        E dc = new E(d,c);
        E dg = new E(d,g);
        d.addEdge(dc);
        d.addEdge(dg);

        E ea = new E(e,a);
        E eb = new E(e,b);
        e.addEdge(ea);
        e.addEdge(eb);

        E fb = new E(f,b);
        E fc = new E(f,c);

        f.addEdge(fb);
        f.addEdge(fc);

        E gc = new E(g,c);
        E gd = new E(g,d);

        g.addEdge(gc);
        g.addEdge(gd);
        return a;
    }



}
