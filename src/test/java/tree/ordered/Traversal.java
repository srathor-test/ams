package tree.ordered;

import org.junit.Test;

import java.util.LinkedList;

public class Traversal {
    @Test
    public void testLevelTraversal() {
       Node root = buildTree();
       LinkedList<Node> queue = new LinkedList<>();
       queue.addLast(root);
       while(!queue.isEmpty()) {
           Node node = queue.removeFirst();
           System.out.println(node.data);
           node.child.forEach( e -> queue.addLast(e));
       }
    }

    @Test
    public void testPreOrderTraversal() {
        Node root = buildTree();
        preOrderRecursion(root);
    }

    private void preOrderRecursion(Node node) {
        System.out.println(node.data);
        node.child.forEach(e -> preOrderRecursion(e));
    }

    @Test
    public void testPostOrderTraversal() {
        Node root = buildTree();
        postOrderRecursion(root);
    }

    private void postOrderRecursion(Node node) {
        node.child.forEach(e -> postOrderRecursion(e));
        System.out.println(node.data);
    }

    private Node buildTree() {
        Node root = new Node("a");
        Node b = new Node("b");
        root.child.add(b);
        Node c = new Node("c");
        root.child.add(c);
        Node d = new Node("d");
        root.child.add(d);
        Node e = new Node("e");
        b.child.add(e);
        Node f = new Node("f");
        b.child.add(f);
        Node h = new Node("h");
        e.child.add(h);
        Node i = new Node("i");
        e.child.add(i);
        Node g = new Node("g");
        Node j = new Node("j");
        g.child.add(j);
        Node k = new Node("k");
        g.child.add(k);
        Node l = new Node("l");
        g.child.add(l);
        Node m = new Node("m");
        g.child.add(m);
        d.child.add(g);
        return root;
    }


}
