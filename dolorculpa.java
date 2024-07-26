import java.util.ArrayList;
import java.util.List;

class Event {
    int id;
    String name;
    String date;

    Event(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{id=" + id + ", name='" + name + "', date='" + date + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();
        events.add(new Event(1, "Event 1", "2024-06-22"));
        events.add(new Event(2, "Event 2", "2024-07-15"));
        events.add(new Event(3, "Event 3", "2024-08-30"));

        int eventId = 2;
        Event event = getEventById(events, eventId);
        if (event != null) {
            System.out.println("Event found: " + event);
        } else {
            System.out.println("Event not found");
        }
    }

    public static Event getEventById(List<Event> events, int eventId) {
        for (Event event : events) {
            if (event.id == eventId) {
                return event;
            }
        }
        return null;
    }
}
