package graphs;

import graphs.base.E;
import graphs.base.Network;
import graphs.base.V;
import org.junit.Test;

public class ShortestPath {

    @Test
    public void testShortestPath() {

        V start = getGraph();

        Network network = new Network(start);
        network.findShortestPaths();
        V ptr = start;
        while(ptr.nextVertex != null) {
            ptr = ptr.nextVertex;
        }

        System.out.println(ptr.dist);
        System.out.println(ptr.name);
        while(ptr.back != null) {
            System.out.println(ptr.name+"<-- ");
            ptr=ptr.back;
        }
        System.out.println(ptr.name);
    }

    private V getGraph() {
        V vA = new V("A");
        V vB = new V("B");
        V vC = new V("C");


        vA.nextVertex = vB;
        vB.nextVertex = vC;



        E ab = new E(vB, 1);
        E ba = new E(vA, 1);
        vA.addEdge(ab);
        vB.addEdge(ba);

        E ac = new E(vC, 6);
        E ca = new E(vA, 6);
        vA.addEdge(ac);
        vC.addEdge(ca);


        E bc = new E(vC, 1);
        E cb = new E(vB, 1);
        vB.addEdge(bc);
        vC.addEdge(cb);

        return vA;
    }

    private V getGraph22() {
        V vA = new V("A");
        V vB = new V("B");
        V vC = new V("C");


        vA.nextVertex = vB;
        vB.nextVertex = vC;



        E ab = new E(vB, 4);
        E ba = new E(vA, 4);
        vA.addEdge(ab);
        vB.addEdge(ba);

        E ac = new E(vC, 6);
        E ca = new E(vA, 6);
        vA.addEdge(ac);
        vC.addEdge(ca);


        E bc = new E(vC, 3);
        E cb = new E(vB, 3);
        vB.addEdge(bc);
        vC.addEdge(cb);

        return vA;
    }
    private V getGraph2() {
        V vA = new V("A");
        V vB = new V("B");
        V vC = new V("C");
        V vE = new V("E");

        vA.nextVertex = vB;
        vB.nextVertex = vC;
        vC.nextVertex = vE;


        E ab = new E(vB, 4);
        E ba = new E(vA, 4);
        vA.addEdge(ab);
        vB.addEdge(ba);

        E ac = new E(vC, 6);
        E ca = new E(vA, 6);
        vA.addEdge(ac);
        vC.addEdge(ca);


        E bc = new E(vC, 3);
        E cb = new E(vB, 3);
        vB.addEdge(bc);
        vC.addEdge(cb);

        E be = new E(vE, 5);
        E eb = new E(vB, 5);
        vB.addEdge(be);
        vE.addEdge(eb);

        E ce = new E(vE, 2);
        E ec = new E(vC, 2);
        vC.addEdge(ce);
        vE.addEdge(ec);
        return vA;
    }

}
