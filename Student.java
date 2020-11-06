public class Student{

    private int studentID;
    public CollegeCourse[] courses = new CollegeCourse[5];

    //set methods   
    public void setID(int id){
        this.studentID = id;
    }

    // get methods
    public int getID(){
        return this.studentID;
    }

    public CollegeCourse getCourses(int i){
        return this.courses[i];
    }
}

