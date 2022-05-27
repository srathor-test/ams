package graphs.base;

public class E {

    public V to;
    public V from;
    public int weight;
    public E nextE;


    public E(V to, int w) {
        this.to = to;
        this.weight = w;
    }

    public E(V from, V to) {
        this.from = from;
        this.to = to;
        this.weight = 0;
    }

    public String toString() {
        return "{"+ this.from+", "+this.to+"}";
    }
}
