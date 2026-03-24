class MyLinkedList {

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }

    Node head;
    Node tail;
    int cnt;

    public MyLinkedList() {
        head = null;
        tail = null;
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
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }

        cnt++;
    }

    public void addAtTail(int val) {
        Node nn = new Node(val);

        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }

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
        nn.prev = temp;
        temp.next.prev = nn;
        temp.next = nn;

        cnt++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= cnt) {
            return;
        }

        if (index == 0) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } 
        else if (index == cnt - 1) {
            tail = tail.prev;

            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        } 
        else {
            Node temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        cnt--;
    }
}