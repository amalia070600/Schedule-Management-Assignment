/**
 * Represents a single class schedule entry with course name,
 * day, start time, and end time.
 */
public class Schedule {
    private String courseName;
    private String day;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    /**
     * Creates a Schedule object.
     *
     * @param courseName name of the course
     * @param day day of the class
     * @param startHour start hour (0–23)
     * @param startMinute start minute (0–59)
     * @param endHour end hour (0–23)
     * @param endMinute end minute (0–59)
     */
    public Schedule(String courseName, String day, int startHour, int startMinute, int endHour, int endMinute) {
        this.courseName = courseName;
        this.day = day;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }

    /** @return the course name */
    public String getCourseName() { return courseName; }

    /** @return the day of the schedule */
    public String getDay() { return day; }

    /** @return the start hour */
    public int getStartHour() { return startHour; }

    /** @return the start minute */
    public int getStartMinute() { return startMinute; }

    /** @return the end hour */
    public int getEndHour() { return endHour; }

    /** @return the end minute */
    public int getEndMinute() { return endMinute; }

    /** @param courseName new course name */
    public void setCourseName(String courseName) { this.courseName = courseName; }

    /** @param day new day */
    public void setDay(String day) { this.day = day; }

    /** @param startHour new start hour */
    public void setStartHour(int startHour) { this.startHour = startHour; }

    /** @param startMinute new start minute */
    public void setStartMinute(int startMinute) { this.startMinute = startMinute; }

    /** @param endHour new end hour */
    public void setEndHour(int endHour) { this.endHour = endHour; }

    /** @param endMinute new end minute */
    public void setEndMinute(int endMinute) { this.endMinute = endMinute; }

    /**
     * Calculates total start time in minutes.
     *
     * @return total minutes from 00:00 for start time
     */
    private int getStartTotalMinutes() {
        return startHour * 60 + startMinute;
    }

    /**
     * Calculates total end time in minutes.
     *
     * @return total minutes from 00:00 for end time
     */
    private int getEndTotalMinutes() {
        return endHour * 60 + endMinute;
    }

    /**
     * Checks if this schedule overlaps with another schedule on the same day.
     *
     * @param other the other schedule to compare with
     * @return true if there is a time conflict, false otherwise
     */
    public boolean hasConflictWith(Schedule other) {
        int s1Start = getStartTotalMinutes();
        int s1End = getEndTotalMinutes();
        int s2Start = other.getStartTotalMinutes();
        int s2End = other.getEndTotalMinutes();

        return (s1Start >= s2Start && s1Start < s2End) ||
                (s1End > s2Start && s1End <= s2End) ||
                (s1Start <= s2Start && s1End >= s2End);
    }

    /**
     * Returns a formatted string representation of the schedule.
     *
     * @return formatted schedule string
     */
    @Override
    public String toString() {
        return String.format("%s - %s | %02d:%02d to %02d:%02d",
                courseName, day, startHour, startMinute, endHour, endMinute);
    }
}
