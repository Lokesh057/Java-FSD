package com.Assist;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    CircularLinkedList() {
        this.head = null;
    }

    // Method to insert a new node into a sorted circular linked list
    void insertSorted(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            newNode.next = newNode; // Point to itself in a circular list
            head = newNode;
        } else if (newData <= head.data) {
            // Insert at the beginning if the new element is smaller or equal to the head
            Node last = getLastNode();
            newNode.next = head;
            last.next = newNode;
            head = newNode;
        } else {
            // Traverse the list to find the appropriate position to insert the new element
            Node current = head;
            while (current.next != head && current.next.data < newData) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to get the last node in the circular linked list
    Node getLastNode() {
        if (head == null) {
            return null;
        }

        Node current = head;
        while (current.next != head) {
            current = current.next;
        }

        return current;
    }

    // Method to display the circular linked list
    void display() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class InsertCircularLinkedlist {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        // Inserting elements into the sorted circular linked list
        circularList.insertSorted(10);
        circularList.insertSorted(20);
        circularList.insertSorted(30);
        circularList.insertSorted(40);

        System.out.println("Original sorted circular linked list:");
        circularList.display();

        // Inserting a new element (25) into the sorted circular linked list
        circularList.insertSorted(25);

        System.out.println("Sorted circular linked list after inserting 25:");
        circularList.display();
    }
}

