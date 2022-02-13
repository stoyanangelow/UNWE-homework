package bg.unwe;

import java.util.ArrayList;

/**
 *
 * @author Plamen
 */
public class Course {
    
    private String name;
    private ArrayList<Student> students;
    
    public Course() {        
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
    }
    
    public Student getStudent(int index) {
        return this.students.get(index);
    }
    
    public int getStudentsCount() {
        return this.students.size();
    }
    
}
