/**
 * Helper data class that temporarily stores schedule information
 * before creating a {@link Schedule} object.
 */
public class ScheduleInfo {
    private String courseName;
    private String day;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    /**
     * Creates a ScheduleInfo object containing course details.
     *
     * @param courseName name of the course
     * @param day day of the class
     * @param startHour start hour (0–23)
     * @param startMinute start minute (0–59)
     * @param endHour end hour (0–23)
     * @param endMinute end minute (0–59)
     */
    public ScheduleInfo(String courseName, String day, int startHour, int startMinute, int endHour, int endMinute) {
        this.courseName = courseName;
        this.day = day;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }

    /** @return the course name */
    public String getCourseName() { return courseName; }

    /** @return the class day */
    public String getDay() { return day; }

    /** @return the start hour */
    public int getStartHour() { return startHour; }

    /** @return the start minute */
    public int getStartMinute() { return startMinute; }

    /** @return the end hour */
    public int getEndHour() { return endHour; }

    /** @return the end minute */
    public int getEndMinute() { return endMinute; }
}
