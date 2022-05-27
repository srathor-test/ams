package graphs.base;

public class Network {
    public V start;

    public Network(V s) {
        start = s;
        //Initialize first node with distance 0;
        if(start != null) {
            start.dist = 0;
        }
        //traverse all the vertex in vertex list and set the distance to max/infinite value;
        for(V p = start.nextVertex; p != null; p = p.nextVertex) {
            p.dist = Integer.MAX_VALUE;
        }
    }

    public void findShortestPaths() { // implements Dijkstra's algorithm
        for(V v = start; v != null; v = closestVertex()){
            for(E e = v.edges; e != null; e =  e.nextE) {
                V w = e.to;
                if(!w.done && v.dist+e.weight < w.dist) {
                    w.dist = v.dist + e.weight;
                    w.back = v;
                }
            }
            System.out.println(v.name+"-done");
            v.done = true;
        }
    }

    private V closestVertex() {
        // returns the vertex with minimal dist among those not done;
        V v = null;
        int minDist = Integer.MAX_VALUE;
        for(V w = start; w!= null; w = w.nextVertex) {
            if(!w.done && w.dist < minDist) {
                v = w;
                minDist = w.dist;
            }
        }
        return v;
    }
}
