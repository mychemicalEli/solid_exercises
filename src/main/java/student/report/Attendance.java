package student.report;

public class Attendance {
    private static final int CREDITS_TO_HOURS_RATIO = 15;
    public int calculateExpectedAttendance(int totalCredits) {return totalCredits * CREDITS_TO_HOURS_RATIO;}

    public String evaluatePerformance(int totalHoursAttended, int expectedAttendance){
        return totalHoursAttended < expectedAttendance / 2 ? "Poor" : "Good";
    }
}
