package tree.ordered;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public String data;
    public List<Node> child = new ArrayList<>();
    public Node(String data) {
        this.data = data;
    }
}
