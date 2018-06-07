package serializabe;

import java.io.Serializable;
import java.util.Date;

/**
 * If we donot implement serializable we cannnot write the student object in file
 * runtime exception is shown java.io.NotSerializableException: serializabe.Student
 * that object is stored in binary file
 */
class Student implements Serializable{
    private int id;
    private String name;
    private int grade;
    private Date dob;

    Student(){

    }

    public Student(int id, String name, int grade, Date dob) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", dob=" + dob +
                '}';
    }
}