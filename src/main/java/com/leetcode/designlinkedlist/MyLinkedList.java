package com.leetcode.designlinkedlist;

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
class MyLinkedList {

    private Node head = null;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        if (size <= 0) {
            return -1;
        }
        if (head == null) {
            return -1;
        }
        //TODO
        Node currentNode = head;
        for (int x = 0; x < index; x++) {
            currentNode = currentNode.next;
        }
        return (int) currentNode.data;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion,
     * the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node newHead = new Node(val);
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        //TODO
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(val);
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list,
     * the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (head == null && index == 0) {
            addAtHead(val);
            return;
        }
        if (head == null) {
            return;
        }

        Node firstPart = head;
        for (int x = 0; x < index - 1 && firstPart.next != null; x++) {
            firstPart = firstPart.next;
        }
        Node secondPart = firstPart.next;
        firstPart.next = new Node(val);
        if (size > 1) {
            firstPart.next.next = secondPart;
        }
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= size || index <= 0) {
            return;
        }
        if (head == null) {
            return;
        }
        //TODO
        Node firstPart = head;
        for (int x = 0; x < index - 1 && firstPart.next != null; x++) {
            firstPart = firstPart.next;
        }
        firstPart.next = firstPart.next.next;
        size--;
    }

    public String debugList() {
        Node temp = head;
        String print = "";
        while (temp != null) {
            print += (int) temp.data + " , ";
            temp = temp.next;
        }
        return print;
    }

    class Node {
        private Node next;
        private Object data;

        public Node(Object dat) {
            data = dat;
        }

        public Object getData() {
            return data;
        }
    }
}


