package student.report;

public class Main {
    public static void main(String[] args) {
        Student student =
                new Student("John", "Doe", 20, 12, 50);

        FeeCalculator feeCalculator = new FeeCalculator();
        String fee = feeCalculator.calculateFee(student.getTotalCredits());
        System.out.println(fee);

        Report report = new Report();
        report.generateReportAttendance(student);
    }
}