public class CollegeCourse {
    private String courseId;
    private int creditHours;
    private String grade;

    //Constructor
    public CollegeCourse(String id, int hours, String grade)
    {
        this.courseId = id;
        this.creditHours = hours;
        this.grade = grade;
    }

    // Set methods
    public void setCourseId(String id)
    {
        courseId = id;//Assign course id to local variable
    }

    public void setHours(int hours)
    {
        creditHours = hours;//Assign course id to local variable
    }

    public void setGrade(String grade)
    {
        this.grade = grade;//Assign course id to local variable
    }

    //Get Methods
    public String getCourseId()
    {
        return courseId;//Provide access to course id
    }

    public int getHours()
    {
        return creditHours;//Provide access to course id
    }

    public String getGrade()
    {
        return grade;//Provide access to course id
    }
}