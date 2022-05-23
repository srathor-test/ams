package lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TestListRangeView {

    @Test
    public void testRangeViewSubList() {

        List<String> list = getList();
        System.out.println(list);

        Collections.fill(list.subList(2, 4), "X");
        System.out.println(list);

        Collections.reverse(list.subList(4, 6));
        System.out.println(list);

        list.subList(2,4).set(0, "Y");
        System.out.println(list);

    }

    private List<String> getList() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
        return list;
    }

    /*
     Iterator has 3 methods
        ListIterator has additional 6 methods which include bidirectional movement
     */

    @Test
    public void testBidirectionalListIterators() {
        List<String> list = getList();
        System.out.println(list);

        ListIterator listIterator = list.listIterator();
        System.out.println(listIterator.nextIndex());
        System.out.println(listIterator.next());

        System.out.println(listIterator.nextIndex());
        listIterator.add("x");
        System.out.println(list);
        System.out.println(listIterator.nextIndex());

        listIterator.next();
        listIterator.set("x");
        System.out.println(list);

        System.out.println(listIterator.nextIndex());
        listIterator.previousIndex();
        listIterator.previous();
        listIterator.set("y");
        System.out.println(list);
    }
}
