package GPACal;
 import java.util.List;
 
public class GPATable {
   
    public static void printTable(List<Course> courses) {
        System.out.println("\nYour GPA table:");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Course Code", "Course Units", "Score", "Grade Points");
        System.out.println("---------------------------------------------------------------");

        for (Course course : courses) {
            System.out.printf("%-15s %-15d %-15.2f %-15.2f%n",
                    course.getCourseCode(), course.getCourseUnits(), course.getScore(), course.getGradePoints());
        }
        System.out.println("---------------------------------------------------------------");
        
    }
}

    
