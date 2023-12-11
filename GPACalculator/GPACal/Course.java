package GPACal;

public class Course {

    private String courseCode;
    private int courseUnits;
    private double score;
    private double gradePoints;

    public Course(String courseCode, int courseUnits, double score, double gradePoints) {
        this.courseCode = courseCode;
        this.courseUnits = courseUnits;
        this.score = score;
        this.gradePoints = gradePoints;
        }

    public String getCourseCode() {
        return courseCode;
        }

    public int getCourseUnits() {
        return courseUnits;
        }

    public double getScore() {
        return score;
        }

    public double getGradePoints() {
        return gradePoints;
        }
    }
    

