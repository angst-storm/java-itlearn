package lab3;

import lab3.ex4.Node;

public class Ex8LinkedList {

    private Node head;

    public void createHead(int[] values) {
        for (int value : values) {
            head = new Node(value, head);
        }
    }

    public void createTail(int[] values) {
        if (values.length == 0) {
            return;
        }
        head = new Node(values[0], null);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            sb.append(ref.value).append(" -> ");
            ref = ref.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value, null);
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = new Node(value, null);
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null) {
            ref.next = new Node(value, ref.next);
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1 && ref.next != null; i++) {
            ref = ref.next;
        }
        if (ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, 0);
    }

    private Node createHeadRecHelper(int[] values, int index) {
        if (index == values.length) {
            return null;
        }
        return new Node(values[index], createHeadRecHelper(values, index + 1));
    }

    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }

    private Node createTailRecHelper(int[] values, int index) {
        if (index == values.length) {
            return null;
        }
        Node node = new Node(values[index], null);
        node.next = createTailRecHelper(values, index + 1);
        return node;
    }

    public String toStringRec() {
        return toStringRecHelper(head) + "null";
    }

    private String toStringRecHelper(Node node) {
        if (node == null) {
            return "";
        }
        return node.value + " -> " + toStringRecHelper(node.next);
    }

    public static void main(String[] args) {
        Ex8LinkedList list = new Ex8LinkedList();
        list.createHead(new int[]{1, 2, 3, 4, 5});
        System.out.println(list);

        list.createTail(new int[]{6, 7, 8, 9, 10});
        System.out.println(list);

        list.addFirst(0);
        System.out.println(list);

        list.addLast(11);
        System.out.println(list);

        list.insert(3, 99);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.createHeadRec(new int[]{10, 20, 30});
        System.out.println(list.toStringRec());

        list.createTailRec(new int[]{40, 50, 60});
        System.out.println(list.toStringRec());
    }
}
