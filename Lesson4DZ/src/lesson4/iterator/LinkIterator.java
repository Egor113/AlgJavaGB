package lesson4.iterator;

import lesson4.Link;
import lesson4.list.LinkedList;

public class LinkIterator {
    private Link currect;
    private Link prev;
    private LinkedList list;

    public LinkIterator(LinkedList list) {
        this.list = list;
        reset();
    }

    private void reset() {
        currect = list.getFirst();
        prev = null;
    }

    public void nexLink() {
        prev = currect;
        currect = currect.next;
    }

    /**
     * @return - true, если дошел до конца
     */
    public boolean atEnd() {
        return (currect.next == null);
    }

    public void insertBefore() {
    }

    public void insertAfter() {
    }

    public String deleteCurrent() {
        return null;
    }

    public Link getCurrect() {
        return currect;
    }


}
