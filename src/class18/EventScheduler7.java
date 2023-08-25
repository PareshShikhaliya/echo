package class18;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

class Event implements Comparable<Event> {
    private String name;
    private LocalDateTime startTime;

    public Event(String name, LocalDateTime startTime) {
        this.name = name;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    @Override
    public int compareTo(Event other) {
        return startTime.compareTo(other.startTime);
    }

    @Override
    public String toString() {
        return "Event: " + name + " (Start Time: " + startTime + ")";
    }
}

public class EventScheduler7 {
    public static void main(String[] args) {
        PriorityQueue<Event> eventQueue = new PriorityQueue<>();

        // Adding events to the priority queue
        eventQueue.add(new Event("Meeting", LocalDateTime.of(2023, Month.AUGUST, 28, 10, 0)));
        eventQueue.add(new Event("Lunch", LocalDateTime.of(2023, Month.AUGUST, 28, 12, 30)));
        eventQueue.add(new Event("Presentation", LocalDateTime.of(2023, Month.AUGUST, 28, 15, 0)));

        // Simulating event processing
        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println("Executing: " + event);
        }
    }
}
