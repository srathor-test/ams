package graphs.base;

public class V {
    //public Object object;
    public E edges;
    public V nextVertex;

    public Boolean done = false;
    public int dist;
    public V back;

    public String name;

    public V(String name) {
        this.name = name;
    }

    public void addEdge(E e) {
        if(e != null) {
            if(edges == null) {
                edges = e;
            } else {
                E ptr = edges;
                while (ptr.nextE != null) {
                    ptr = ptr.nextE;
                }
                ptr.nextE = e;
            }
        }
    }

    public String toString() {
        return this.name;

    }
}
