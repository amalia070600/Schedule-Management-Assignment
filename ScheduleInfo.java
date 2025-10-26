public class ScheduleInfo {
    private String courseName;
    private String day;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    public ScheduleInfo(String courseName, String day, int startHour, int startMinute, int endHour, int endMinute) {
        this.courseName = courseName;
        this.day = day;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }

    public String getCourseName() { return courseName; }
    public String getDay() { return day; }
    public int getStartHour() { return startHour; }
    public int getStartMinute() { return startMinute; }
    public int getEndHour() { return endHour; }
    public int getEndMinute() { return endMinute; }
}
