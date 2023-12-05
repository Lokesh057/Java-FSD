package com.Assist;
	class DoublyNode {
		    int data;
		    DoublyNode prev;
		    DoublyNode next;

		    DoublyNode(int data) {
		        this.data = data;
		        this.prev = null;
		        this.next = null;
		    }
		}

		class DoublyLinkedList {
		    DoublyNode head;

		    DoublyLinkedList() {
		        this.head = null;
		    }

		    // Method to insert a new node at the end of the doubly linked list
		    void insertEnd(int newData) {
		        DoublyNode newNode = new DoublyNode(newData);

		        if (head == null) {
		            head = newNode;
		        } else {
		            DoublyNode last = head;
		            while (last.next != null) {
		                last = last.next;
		            }
		            last.next = newNode;
		            newNode.prev = last;
		        }
		    }

		    // Method to traverse the doubly linked list in the forward direction
		    void traverseForward() {
		        DoublyNode current = head;

		        System.out.println("Doubly Linked List (Forward):");
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }

		    // Method to traverse the doubly linked list in the backward direction
		    void traverseBackward() {
		        DoublyNode last = head;

		        // Move to the end of the list
		        while (last != null && last.next != null) {
		            last = last.next;
		        }

		        System.out.println("Doubly Linked List (Backward):");
		        while (last != null) {
		            System.out.print(last.data + " ");
		            last = last.prev;
		        }
		        System.out.println();
		    }
		}

		public class DoublyLinkedListTraversal {
		    public static void main(String[] args) {
		        DoublyLinkedList doublyList = new DoublyLinkedList();

		        // Inserting elements into the doubly linked list
		        doublyList.insertEnd(10);
		        doublyList.insertEnd(20);
		        doublyList.insertEnd(30);
		        doublyList.insertEnd(40);

		        // Traverse the doubly linked list in the forward direction
		        doublyList.traverseForward();

		        // Traverse the doubly linked list in the backward direction
		        doublyList.traverseBackward();
		    }
		}

	


