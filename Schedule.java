public class Schedule {
    private String courseName;
    private String day;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    public Schedule(String courseName, String day, int startHour, int startMinute, int endHour, int endMinute) {
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

    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setDay(String day) { this.day = day; }
    public void setStartHour(int startHour) { this.startHour = startHour; }
    public void setStartMinute(int startMinute) { this.startMinute = startMinute; }
    public void setEndHour(int endHour) { this.endHour = endHour; }
    public void setEndMinute(int endMinute) { this.endMinute = endMinute; }

    private int getStartTotalMinutes() {
        return startHour * 60 + startMinute;
    }

    private int getEndTotalMinutes() {
        return endHour * 60 + endMinute;
    }

    public boolean hasConflictWith(Schedule other) {
        int s1Start = getStartTotalMinutes();
        int s1End = getEndTotalMinutes();
        int s2Start = other.getStartTotalMinutes();
        int s2End = other.getEndTotalMinutes();

        return (s1Start >= s2Start && s1Start < s2End) ||
                (s1End > s2Start && s1End <= s2End) ||
                (s1Start <= s2Start && s1End >= s2End);
    }

    @Override
    public String toString() {
        return String.format("%s - %s | %02d:%02d to %02d:%02d",
                courseName, day, startHour, startMinute, endHour, endMinute);
    }
}
