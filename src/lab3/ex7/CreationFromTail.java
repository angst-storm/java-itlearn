package lab3.ex7;

import lab3.ex4.Node;

public class CreationFromTail {

    public static void main(String[] args) {
        Node head = null, tail = null;

        for (int i = 0; i <= 9; i++) {
            Node newNode = new Node(i, null);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
