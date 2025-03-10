public class Course {
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method for testing
    public static void main(String[] args) {
        Course.updateInstituteName("Tech Academy");
        
        Course c1 = new Course("Java Programming", 10, 500.0);
        Course c2 = new Course("Web Development", 12, 600.0);
        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
