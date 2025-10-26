public class TimeUtils {
    public static int[] parseTime(String timeInput) throws Exception {
        String[] parts = timeInput.split(":");
        if (parts.length != 2) throw new Exception("Invalid time format.");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59)
            throw new Exception("Invalid time value.");
        return new int[]{hour, minute};
    }
}