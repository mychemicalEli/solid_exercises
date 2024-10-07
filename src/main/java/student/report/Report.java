package student.report;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Report {
    private final LocalDate reportDate;

    public Report (){
        this.reportDate =LocalDate.now();
}

    public void generateReportAttendance (Student student){
        String report = getReport(student);
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(new FileWriter("report.txt"));
            printWriter.println(report);
            printWriter.close();
            System.out.println("Report file generated");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private String getReport(Student student){
        Attendance attendance = new Attendance();
        int expectedAttendance = attendance.calculateExpectedAttendance(student.getTotalCredits());
        String performance = attendance.evaluatePerformance(student.getTotalHoursAttended(),expectedAttendance);
        return "Attendance Report - " + reportDate + "\n" +
                "Student: " + student.getFirstName() + " " + student.getLastName() + "\n" +
                "Total Hours Attended: " + student.getTotalHoursAttended() + "\n" +
                "Expected Attendance: " + expectedAttendance + "\n" +
                "Performance: " + performance;
    }
}
