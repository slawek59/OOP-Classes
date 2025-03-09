public class Student {
    private String name;
    private double grade;

    public Student(string name, double grade){
        this.name = name;
        this.grade = grade;
    }   
    
    public boolean hasPassed(){
        return grade >= 5.0;
    }
}
