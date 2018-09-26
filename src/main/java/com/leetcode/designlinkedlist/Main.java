package com.leetcode.designlinkedlist;

public class Main {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
/*        linkedList.addAtHead(1);
        System.out.println(linkedList.debugList());
        //System.out.println("Should return 1: returns " + linkedList.get(1));            // returns 1
        linkedList.addAtTail(3);
        System.out.println(linkedList.debugList());
        //System.out.println("Should return 3: returns " + linkedList.get(2));              // returns 3
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        System.out.println(linkedList.debugList());
        System.out.println("Should return 2: returns " + linkedList.get(1));            // returns 2


        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        System.out.println(linkedList.debugList());
        System.out.println("Should return 3: returns " + linkedList.get(1));            // returns 3*/

        linkedList.addAtIndex(0, 1);
        System.out.println(linkedList.debugList());
        System.out.println(linkedList.get(1));
    }
}
