package com.Assist;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {

		        Queue<Integer> queue = new LinkedList<>();

		        // Insert elements into the queue (enqueue)
		        enqueueElements(queue, 10);
		        enqueueElements(queue, 20);
		        enqueueElements(queue, 30);

		        // Display the elements in the queue
		        System.out.println("Queue after enqueuing elements: " + queue);

		        // Remove elements from the queue (dequeue)
		        dequeueElements(queue);
		        dequeueElements(queue);

		        // Display the elements in the queue after dequeuing
		        System.out.println("Queue after dequeuing elements: " + queue);
		    }

		    // Method to insert elements into the queue (enqueue)
		    private static void enqueueElements(Queue<Integer> queue, int element) {
		        System.out.println("Enqueuing element: " + element);
		        queue.offer(element);
		    }

		    // Method to remove elements from the queue (dequeue)
		    private static void dequeueElements(Queue<Integer> queue) {
		        if (queue.isEmpty()) {
		            System.out.println("Queue is empty. Cannot dequeue.");
		        } else {
		            int dequeuedElement = queue.poll();
		            System.out.println("Dequeued element: " + dequeuedElement);
		        }
		    }
		}


