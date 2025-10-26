/**
 * Utility class for handling time-related operations.
 */
public class TimeUtils {

    /**
     * Parses a time string in "HH:MM" format into hours and minutes.
     *
     * @param timeInput the time string to parse
     * @return an integer array where index 0 = hour and index 1 = minute
     * @throws Exception if the format is invalid or the time values are out of range
     */
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