package com.Assist;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node1 head;

    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    void insert(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
        } else {
            Node1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to delete the first occurrence of a key in the linked list
    void deleteFirstOccurrence(int key) {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node1 current = head;
        Node1 prev = null;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        prev.next = current.next;
    }

    // Method to display the linked list
    void display() {
        Node1 current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class DeleteFirstOccurence {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting elements into the linked list
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        System.out.println("Original linked list:");
        linkedList.display();

        // Deleting the first occurrence of key 20
        linkedList.deleteFirstOccurrence(20);

        System.out.println("Linked list after deleting first occurrence of key 20:");
        linkedList.display();
    }
}


