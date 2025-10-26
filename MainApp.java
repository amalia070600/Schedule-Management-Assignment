import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    private static final ArrayList<Schedule> schedules = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nSchedule Management System");
            System.out.println("1. Add Schedule");
            System.out.println("2. View All Schedules");
            System.out.println("3. Edit Schedule");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addScheduleMenu();
                case 2 -> viewSchedules();
                case 3 -> editScheduleMenu();
                case 4 -> System.out.println("Exiting program");
                default -> System.out.println("Invalid option");
            }
        } while (choice != 4);
    }

    private static void addScheduleMenu() {
        try {
            System.out.print("Course name: ");
            String courseName = scanner.nextLine();

            System.out.print("Day: ");
            String day = scanner.nextLine();

            System.out.print("Start time (HH:MM): ");
            int[] start = TimeUtils.parseTime(scanner.nextLine());

            System.out.print("End time (HH:MM): ");
            int[] end = TimeUtils.parseTime(scanner.nextLine());

            ScheduleInfo info = new ScheduleInfo(courseName, day, start[0], start[1], end[0], end[1]);
            addSchedule(info);
        } catch (Exception e) {
            System.out.println("Error adding schedule: " + e.getMessage());
        }
    }

    private static void addSchedule(ScheduleInfo info) {
        Schedule newSchedule = new Schedule(
                info.getCourseName(),
                info.getDay(),
                info.getStartHour(),
                info.getStartMinute(),
                info.getEndHour(),
                info.getEndMinute()
        );

        for (Schedule existing : schedules) {
            if (existing.getDay().equalsIgnoreCase(newSchedule.getDay()) &&
                    existing.hasConflictWith(newSchedule)) {
                System.out.println("Conflict detected! Schedule overlaps with: " + existing);
                return;
            }
        }

        schedules.add(newSchedule);
        System.out.println("Schedule successfully added");
    }

    private static void viewSchedules() {
        if (schedules.isEmpty()) {
            System.out.println("No schedules found.");
            return;
        }
        System.out.println("\nCurrent Schedules");
        for (Schedule s : schedules) {
            System.out.println(s);
        }
    }

    private static void editScheduleMenu() {
        viewSchedules();
        if (schedules.isEmpty()) return;

        System.out.print("Enter index to edit (1 - " + schedules.size() + "): ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index < 0 || index >= schedules.size()) {
            System.out.println("Invalid index");
            return;
        }

        Schedule selected = schedules.get(index);

        try {
            System.out.print("New Course Name (" + selected.getCourseName() + "): ");
            String courseName = scanner.nextLine();

            System.out.print("New Day (" + selected.getDay() + "): ");
            String day = scanner.nextLine();

            System.out.print("New Start Time (HH:MM): ");
            int[] start = TimeUtils.parseTime(scanner.nextLine());

            System.out.print("New End Time (HH:MM): ");
            int[] end = TimeUtils.parseTime(scanner.nextLine());

            selected.setCourseName(courseName);
            selected.setDay(day);
            selected.setStartHour(start[0]);
            selected.setStartMinute(start[1]);
            selected.setEndHour(end[0]);
            selected.setEndMinute(end[1]);

            System.out.println("Schedule updated successfully!");
        } catch (Exception e) {
            System.out.println("Error editing schedule: " + e.getMessage());
        }
    }
}
