package class18;

import java.util.*;

class Task implements Comparable<Task> {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Implementing Comparable to compare tasks based on priority
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + description + " (Priority: " + priority + ")";
    }
}

public class TaskManager6 {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Adding tasks to the priority queue
        taskQueue.add(new Task("Complete report", 2));
        taskQueue.add(new Task("Prepare presentation", 1));
        taskQueue.add(new Task("Reply to emails", 3));

        // Processing tasks based on priority
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Executing: " + task);
        }
    }
}
