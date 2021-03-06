package types;

/**
 * Represents an event and where it is at
 */
public class Event extends Task {

    /**
     * Where the event is
     */
    protected String at;

    /**
     * An event that takes place at a certain time
     * @param description what the event is
     * @param at time the event is at
     */
    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    /**
     * The event in string form
     * @return string of event with where it is
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at:" + at + ")";
    }

    /**
     * Get type of task
     * @return type
     */
    @Override
    public String getType() {
        return "E";
    }

    /**
     * Returns when the event is
     * @return when event is at
     */
    @Override
    public String getAt() {
        return at;
    }
}
