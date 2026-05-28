class MyLinkedList {

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    Node head, tail;
    int cnt;

    public MyLinkedList() {
        head = tail = null;
        cnt = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= cnt) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {

        Node nn = new Node(val);

        if (head == null) {
            head = tail = nn;
            cnt++;
            return;
        }

        nn.next = head;
        head = nn;
        cnt++;
    }

    public void addAtTail(int val) {

        Node nn = new Node(val);

        if (head == null) {
            head = tail = nn;
            cnt++;
            return;
        }

        tail.next = nn;
        tail = nn;
        cnt++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > cnt) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == cnt) {
            addAtTail(val);
            return;
        }

        Node nn = new Node(val);

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        nn.next = temp.next;
        temp.next = nn;

        cnt++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= cnt) {
            return;
        }

        // delete head
        if (index == 0) {

            head = head.next;

            // if list becomes empty
            if (head == null) {
                tail = null;
            }

            cnt--;
            return;
        }

        Node temp = head;

        // move to previous node
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // update tail if deleting last node
        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;

        cnt--;
    }
}