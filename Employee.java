public class Employee {

    // Declare instance variables
    String first, last;
    Double salary;

    // Constructure for employee object
    Employee(String first, String last, Double salary){
        this.first = first;
        this.last = last;
        this.salary = salary;
    }

    // Set methods
    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Get methods
    public String getFirst() {
        return this.first;
    }

    public String getLast() {
        return this.last;
    }

    public Double getSalary() {
        return this.salary;
    }
}
