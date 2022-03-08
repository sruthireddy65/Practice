package com.practice.solve;

public class ReverseLinkedList {

    public static void main(String[] args) {
        SingleLLNode node1 = new SingleLLNode(10);
        SingleLLNode node2 = new SingleLLNode(20);
        SingleLLNode node3 = new SingleLLNode(30);
        node1.next = node2;
        node2.next = node3;
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverse(node1);
    }
    public void reverse(SingleLLNode node){
        SingleLLNode reverse = null;
        SingleLLNode current = node;
        while (current != null){
            SingleLLNode next = current.next;
            current.next = reverse;
            reverse = current;
            current = next;
        }

        while(reverse != null){
            System.out.println(reverse.data);
            reverse = reverse.next;
        }
    }
}
