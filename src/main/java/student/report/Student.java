package student.report;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int totalCredits;
    private int totalHoursAttended;

    public Student(String firstName, String lastName, int age, int totalCredits, int totalHoursAttended) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.totalCredits = totalCredits;
        this.totalHoursAttended = totalHoursAttended;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getTotalHoursAttended() {
        return totalHoursAttended;
    }

    public void setTotalHoursAttended(int totalHoursAttended) {
        this.totalHoursAttended = totalHoursAttended;
    }

}
