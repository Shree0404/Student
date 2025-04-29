public class New{
    public void displayCourses() {
        System.out.println("Semester 1:");
        System.out.println("  Course: Math - Marks: 85");
        System.out.println("  Course: English - Marks: 90");

        System.out.println("Semester 2:");
        System.out.println("  Course: Physics - Marks: 80");
        System.out.println("  Course: Chemistry - Marks: 88");
    }

    public static void main(String[] args) {
        Student student = new Student("Chetan", "2004-05-27");
        student.displayStudentInfo();

        StudentCourses sc = new StudentCourses();
        sc.displayCourses();
    }
}
